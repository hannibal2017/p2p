package com.test.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.test.domain.Grid;

public class ResultUtil {
	public static String getSuccessInfo(String message, Object otherObj) {
		Map map = new HashMap();
		map.put("success", Integer.valueOf(1));
		map.put("message", message);
		map.put("object", otherObj);
		return JSON.toJSONString(map, new SerializerFeature[] { SerializerFeature.DisableCircularReferenceDetect });
	}

	public static Map getGridInfo(int flag, String message, Grid grid) {
		Map map = new HashMap();
		map.put("success", Integer.valueOf(flag));
		map.put("message", message);
		map.put("page", grid.getCount());
		map.put("data", grid.getList());
		return map;
	}

	public static String getGridInfo(Grid grid) {
		Map map = new HashMap();
		map.put("total", grid.getCount());
		map.put("rows", grid.getList());
		return JSON.toJSONString(map);
	}

	public static String getFailureInfo(int flag, String message) {
		/* 73 */ Map map = new HashMap();
		/* 74 */ map.put("success", Integer.valueOf(flag));
		/* 75 */ map.put("message", message);
		/* 76 */ return JSON.toJSONString(map);
	}

	public static String getFailureInfo(String message) {
		/* 88 */ Map map = new HashMap();
		/* 89 */ map.put("success", Integer.valueOf(0));
		/* 90 */ map.put("message", message);
		/* 91 */ return JSON.toJSONString(map);
	}

	public static String getSessionFailureInfo() {
		/* 99 */ Map map = new HashMap();
		/* 100 */ map.put("session", Boolean.valueOf(false));
		/* 101 */ return JSON.toJSONString(map);
	}
	
	public static String getJsonString(List list) {
		Map map = new HashMap();
		map.put("rows", list);
		return JSON.toJSONString(map);
	}
}