package org.imf.oplexecutor.macro;

import java.io.File;

import org.imf.oplexecutor.fims.bms.ErrorCodeType;

//Finds AssetMap and returns the Path
public class AssetMapFinder {

	private String oplpath;
	
	public AssetMapFinder(String oplpath) {
		this.oplpath = oplpath;
	}
	
	public String find()
	{
			//Searching in Folder for AssetMAP
			File f = new File(oplpath);
			String fSub = f.getParent();
			String ampath = null;
			boolean found = false;
		
		File [] files = f.listFiles();
		for (int i=0; i<files.length; i++) {
			if(files[i].getName().equalsIgnoreCase("AssetMap.xml")){
				found = true;
				ampath = files[i].getPath();
				break;
			}
		}

		//Searching in upper Folder for AssetMAP
		if (found == false) {
			File f2 = new File(fSub);
			File [] files2 = f2.listFiles();
			for (int j=0; j<files.length; j++)  {
				if(files2[j].getName().equalsIgnoreCase("AssetMap.xml")) {
					found = true;
					ampath = files2[j].getPath();
					break;
				}
			}
		}
		//Return Path or Failure
		if (found == false) {
			System.out.println("Assetmap not found");
			return "Assetmap not found";
		}
		else {
			return ampath;
		}
	}
}
