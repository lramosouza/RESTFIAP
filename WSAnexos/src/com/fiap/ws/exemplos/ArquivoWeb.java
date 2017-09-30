package com.fiap.ws.exemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;

@WebService
public class ArquivoWeb {
	@WebMethod
	public void upload(String fileName, byte[] imageBytes){
		String filePath = "C:/Temp/Upload/" + fileName;
		try{
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream out = new BufferedOutputStream(fos);
			out.write(imageBytes);
			out.close();
		}catch (IOException e1){
			e1.printStackTrace();
		}
	}
	
	@WebMethod
	public byte[] download(String fileName){
		String filePath = "C:/Temp/Download/" + fileName;
		File file = new File(filePath);
		try{
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream inputStream = new BufferedInputStream(fis);
			byte[] fileBytes = new byte[(int) file.length()];
			
			inputStream.read(fileBytes);
			inputStream.close();
			
			return fileBytes;
		}catch(Exception e){
			throw new WebServiceException(e.getMessage());
		}
	}
}
