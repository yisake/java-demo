package interview.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ReadConfig {
	
	public static void main(String[] args) throws Exception {
		
		File file1 = new File("");
		String projectPath = file1.getAbsolutePath();//获取项目目录	
		File file = new File(ReadConfig.class.getName()); 
		String javapath = file.getPath();
		//所以获取java文件的本地绝对路径为：
		String path = projectPath+"\\src\\"+javapath.replace(".", "\\")+".java";
		System.out.println(path);
				
		String filePath=System.getProperty("user.dir")+"\\src\\main\\java\\"+ReadConfig.class.getPackage().getName().replace(".", "\\")+"\\";
		System.out.println(filePath);
		
		InputStream is=new FileInputStream(filePath+"test.config");		
		Properties ps = new Properties();
		ps.load(is);
		
		//读取参数
		System.out.println("##Name is:"+ps.getProperty("name"));
		System.out.println("##Age is:"+ps.getProperty("age"));
		if (ps.containsKey("school")) {
			System.out.println("##Contains key:school");
		} else {
			System.out.println("##Not Contains key:school");
		}
		
		ps.put("##Height", 168);
		
		//写入参数
		OutputStream os=new FileOutputStream(filePath+"test.config");
		ps.setProperty("Height", "168");
		ps.store(os, "Update " + "Height" + " name");
	}
}
