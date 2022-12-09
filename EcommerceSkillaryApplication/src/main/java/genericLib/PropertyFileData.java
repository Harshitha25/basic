package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileData {
	
	public String getData(String key) throws IOException
	{
	Properties pd=new Properties();
	FileInputStream fis=new FileInputStream(AutoConstant.propertyfilePath);
	pd.load(fis);
	return pd.getProperty(key);
	
	
}
}