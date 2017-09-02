package interview.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
/**
鐗圭偣:
绠�鍖栫殑API; 
鏃犳槧灏勬枃浠�; 
楂樻�ц兘,浣庡唴瀛樺崰鐢�; 
鏁存磥鐨刋ML; 
涓嶉渶瑕佷慨鏀瑰璞�;鏀寔鍐呴儴绉佹湁瀛楁,涓嶉渶瑕乻etter/getter鏂规硶,final瀛楁;闈炲叕鏈夌被,鍐呴儴绫�;绫讳笉闇�瑕侀粯璁ゆ瀯閫犲櫒,瀹屽叏瀵硅薄鍥炬敮鎸�.缁存姢瀵硅薄寮曠敤璁℃暟,寰幆寮曠敤. i 
鎻愪緵搴忓垪鍖栨帴鍙�; 
鑷畾涔夎浆鎹㈢被鍨嬬瓥鐣�; 
璇︾粏鐨勯敊璇瘖鏂�; 
蹇�熻緭鍑烘牸寮�;褰撳墠鏀寔 JSON 鍜� morphing.

浣跨敤鍦烘櫙
Transport 杞崲 
Persistence 鎸佷箙鍖栧璞� 
Configuration 閰嶇疆 
Unit Tests 鍗曞厓娴�
 */
@XStreamAlias("person")
public class XStreamDemo {
	@XStreamAlias("firstName")
	private String firstName;
	@XStreamAlias("lastName")
	private String lastName;
	@XStreamAlias("telephone")
	private String telephone;
	@XStreamAlias("faxphone")
	private PhoneNumber fax;
	
	
	//phoneNumber绫诲瀷
	@XStreamAlias("phoneNumber")
	public static class PhoneNumber{
		@XStreamAlias("code")
		private int code;
		@XStreamAlias("number")
		private String number;
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
	}
	
	public static class Friends {
	}
}


/**
 * 2.Xstream娉ㄨВ甯哥敤鐭ヨ瘑锛�
@XStreamAlias("message") 鍒悕娉ㄨВ 
浣滅敤鐩爣: 绫�,瀛楁 
@XStreamImplicit 闅愬紡闆嗗悎 
@XStreamImplicit(itemFieldName="part") 
浣滅敤鐩爣: 闆嗗悎瀛楁 
@XStreamConverter(SingleValueCalendarConverter.class) 娉ㄥ叆杞崲鍣� 
浣滅敤鐩爣: 瀵硅薄 
@XStreamAsAttribute 杞崲鎴愬睘鎬� 
浣滅敤鐩爣: 瀛楁 
@XStreamOmitField 蹇界暐瀛楁 
浣滅敤鐩爣: 瀛楁 
Auto-detect Annotations 鑷姩渚︽煡娉ㄨВ  
xstream.autodetectAnnotations(true); 
鑷姩渚︽煡娉ㄨВ涓嶺Stream.processAnnotations(Class[] cls)鐨勫尯鍒湪浜庢�ц兘.鑷姩渚︽煡娉ㄨВ灏嗙紦瀛樻墍鏈夌被鐨勭被鍨�.
 */