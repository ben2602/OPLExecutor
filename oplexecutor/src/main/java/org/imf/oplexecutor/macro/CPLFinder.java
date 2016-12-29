package org.imf.oplexecutor.macro;

import java.io.File;

//Finds CPL and returns the Path
public class CPLFinder {

	private String cplfilename;
	private String ampath;
	
	public CPLFinder(String ampath, String cplfilename) {
		this.cplfilename = cplfilename;
		this.ampath = ampath;
	}
	
	public String find()
	{
		//Searching in Asset-Map Folder for CPL-File		
		File f = new File(ampath);
		String fdir = f.getParent();
		File fs = new File (fdir);
		String cplpath = null;
		boolean found = false;
		
		File [] files = fs.listFiles();
		
		for (int i=0; i<files.length; i++) {
			if(files[i].getName().equalsIgnoreCase(cplfilename)){
				found = true;
				cplpath = files[i].getPath();
				break;
			}
			//Searching in Subfolder for CPL-File
			if (files[i].isDirectory()) {
				File f2 = new File(files[i].getPath());
				File [] files2 = f2.listFiles();
				for(int j=0; j<files2.length; j++) {
					if(files2[j].getName().equalsIgnoreCase(cplfilename)){
						found = true;
						cplpath = files2[i].getPath();
						break;
					}
				}
			}
		}
		//Returns CPL-File as String
		if (found == false) {
			System.out.println("CPL-File not found");
			return "CPL-File not found";
		}
		else {
			System.out.print(cplpath);
			return cplpath;
		}
		
	}
}