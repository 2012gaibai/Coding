package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	static Map<String, String> map = new HashMap<String, String>();
	static {
		map.put("2*1", "2");
		map.put("3*1", "3");
		map.put("4*1", "4");
		map.put("5*1", "5");
		map.put("6*1", "6");
		map.put("7*1", "7");
		map.put("8*1", "8");
		map.put("2*3", "1,2");
		map.put("3*6", "1,2");
		map.put("3*7", "1,2,3");
		map.put("4*10", "1,2");
		map.put("4*14", "1,2,3");
		map.put("4*15", "1,2,3,4");
		map.put("5*15", "1,2");
		map.put("5*25", "1,2,3");
		map.put("5*30", "1,2,3,4");
		map.put("5*31", "1,2,3,4,5");
		map.put("6*21", "1,2");
		map.put("6*41", "1,2,3");
		map.put("6*56", "1,2,3,4");
		map.put("6*62", "1,2,3,4,5");
		map.put("6*63", "1,2,3,4,5,6");
		map.put("7*127", "1,2,3,4,5,6,7");
		map.put("8*255", "1,2,3,4,5,6,7,8");
		map.put("3*3", "2");
		map.put("3*4", "2,3");
		map.put("4*6", "2");
		map.put("4*11", "2,3,4");
		map.put("5*10", "2");
		map.put("5*20", "2,3");
		map.put("5*26", "2,3,4,5");
		map.put("6*15", "2");
		map.put("6*35", "2,3");
		map.put("6*50", "2,3,4");
		map.put("6*57", "2,3,4,5,6");
		map.put("7*120", "2,3,4,5,6,7");
		map.put("8*247", "2,3,4,5,6,7,8");
		map.put("4*4", "3");
		map.put("4*5", "3,4");
		map.put("5*16", "3,4,5");
		map.put("6*20", "3");
		map.put("6*42", "3,4,5,6");
		map.put("5*5", "4");
		map.put("5*6", "4,5");
		map.put("6*22", "4,5,6");
		map.put("7*35", "4");
		map.put("8*70", "4");
		map.put("6*6", "5");
		map.put("6*7", "5,6");
		map.put("7*21", "5");
		map.put("8*56", "5");
		map.put("7*7", "6");
		map.put("7*8", "6,7");
		map.put("8*28", "6");
		map.put("8*8", "7");
		map.put("8*9", "7,8");

	}
	
	

	public static void count(List<String> result, int i, String str,
			List<Integer> list, int n) {
		if (n == 0) {
			result.add(str);
			return;
		}
		if (i == list.size()) {
			return;
		}

		// 组合数第一个数固定，寻找剩下的n-1个
		count(result, i + 1, str + list.get(i) + ",", list, n - 1);

		// 移动组合数的起始位置，寻找新起点开始的组合数
		count(result, i + 1, str, list, n);

	}

	public static void count(List<String> result, int i, String str,
			String[] num, int n) {
		if (n == 0) {
			// 已经找到一个组合数
			result.add(str);
			return;
		}
		if (i == num.length) {
			// 到达组合集合的终点
			return;
		}

		// 组合数第一个数固定，寻找剩下的n-1个
		count(result, i + 1, str + num[i] + ",", num, n - 1);

		// 移动组合数的起始位置，寻找新起点开始的组合数
		count(result, i + 1, str, num, n);
	}

	public static int productStr(String str) {
		int product = 1;
		String[] strings = str.split(",");
		for (String tmp : strings) {
			product *= Integer.parseInt(tmp);
		}
		return product;
	}

	/**
	 * 竞彩求串关注数
	 * 
	 * @param list
	 *            每场的投注数
	 * @param str
	 *            串关方式
	 * @return 注数
	 */
	public static int jcInvCount(List<Integer> list, String str) {
		int investCount = 0;
		List<String> result = new ArrayList<String>();
		String[] pass = str.split("[^0-9]");// 过关方式
		String[] zuhe = map.get(str).split(","); // 该串关由哪些串关方式组成 如：3*4由3*1和2*1构成
		int guan = Integer.parseInt(pass[0]); // 串关的关数

		if (guan < list.size()) { // 串关数小于所选比赛数，分两次拆分

			List<String> resList = new ArrayList<String>();

			count(resList, 0, "", list, guan); // 第一次拆分，拆成与串关关数相同
			
			
			//第二次拆分，拆成最小串关元素
			for (String tmp : resList) {
				String[] num = tmp.split(",");
				for (String temp : zuhe) {
					int n = Integer.parseInt(temp);
					count(result, 0, "", num, n);    
				}
			}
			resList.clear();

			
		} else if (guan == list.size()) {  // 串关数等于所选比赛数
			
			for (String temp : zuhe) {
				int n = Integer.parseInt(temp);
				count(result, 0, "", list, n);
			}
			
			
		} else {
			return investCount;
		}

		for (String tmp : result) {
			investCount += productStr(tmp);
		}

		result.clear();

		return investCount;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(2);
		//list.add(1);
		// list.add(3);
		// list.add(2);
		// list.add(2);
		String str = "2*1";
		System.out.println(jcInvCount(list, str));

	}
}
