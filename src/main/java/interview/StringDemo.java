package interview;

public class StringDemo {

	public StringDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String [] args) {
		String demo=" generator constructor stub ";

		//瀛楃涓查暱搴�
		System.out.println("##瀛楃涓查暱搴�");
		System.out.println(demo.length());		
		
		//瀛楃涓叉埅鍙栵紝鎴彇鏌愪釜瀛楃
		System.out.println("##鍙栨煇涓瓧绗︿覆");
		System.out.println(demo.charAt(0));

		//瀛楃涓叉埅鍙栵紝鎴彇澶氫釜瀛楃
		System.out.println("##鎴彇澶氫釜瀛楃涓�");
		char buf[]=new char[20];
		demo.getChars(0, 4, buf, 0);
		System.out.println(buf[0]);
				
		//瀛楃涓叉埅鍙栵紝鎴彇澶氫釜瀛楃涓诧紝
		demo.getBytes();
		
		//杞崲涓哄瓧绗︽暟缁�
		char buf2[]=demo.toCharArray();
		System.out.println(buf2[0]);
		
		//姣旇緝瀛楃涓�
		System.out.println("##姣旇緝瀛楃涓�");
		System.out.println(demo.equals("hf"));
		System.out.println(demo.equals(" generator constructor stub "));
		
		//姣旇緝瀛楃涓诧紝蹇界暐澶у皬鍐�
		System.out.println("##姣旇緝瀛楃涓诧紝蹇界暐澶у皬鍐�");
		System.out.println(demo.equals(" Generator constructor stub "));
		
		//姣旇緝瀛楃涓�
		
		
		//鏌ヨ瀛楃涓茬涓�娆″嚭鐜扮殑鍦版柟锛�
		System.out.println("##鏌ヨ绗竴娆� 鏈�鍚庝竴娆″嚭鐜扮殑瀛楃涓�");
		System.out.println(demo.indexOf("h"));
		
		//鍙栧瓙瀛楃涓�
		System.out.println("##鍙栧瓙瀛楃涓�");
		System.out.println(demo.substring(1));
		System.out.println(demo.substring(1, 3));

		//鏌ユ壘瀛楃涓�
		System.out.println("##鏌ユ壘瀛楃涓�");
		System.out.println(demo.indexOf(0));
		System.out.println(demo.indexOf("con", 0));
		System.out.println(demo.indexOf("con"));
		
		//杩炴帴涓や釜瀛楃涓�
		System.out.println("##杩炴帴涓や釜瀛楃涓�");
		System.out.println(demo+":Testing!");
		
		//瀛楃涓叉浛鎹�
		System.out.println("##瀛楃涓叉浛鎹�");
		System.out.println(demo.replace("ge","Ge"));
		
		//鍘绘帀璧峰鍜岀粨灏剧殑绌烘牸
		System.out.println("##鍘绘帀璧峰鍜岀粨灏剧殑绌烘牸");
		System.out.println(demo.trim());
		
		//杞崲涓哄皬鍐�
		System.out.println("##杞崲涓哄ぇ鍐�");
		
		
		//杞崲涓哄ぇ鍐�
	}
}
