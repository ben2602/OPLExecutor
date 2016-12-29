package org.imf.oplexecutor.macro;

import java.io.File;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

//Opens AssetMap-File to look for the CPL-Filename and starts CPL-Finder
public class AssetMapReader {
		private String amPath;
	
		public AssetMapReader(String amPath) {
			this.amPath = amPath;
		}
		
		public void getCplFileName(String cplId) {
			
			Document doc = null;
			
			File f = new File(amPath);
					
			try {
					SAXBuilder builder = new SAXBuilder();
					doc = builder.build(f);
					
					//Extract Root Element
					Element AssetMap = doc.getRootElement();
					Element AssetList = AssetMap.getChild("AssetList", null);
					List<Element> Asset = AssetList.getChildren("Asset", null);
					for (Element k: Asset) {
						if(k.getChildText("Id", null).equalsIgnoreCase(cplId)){
							Element ChunkList = k.getChild("ChunkList", null);
							List<Element> Chunk = ChunkList.getChildren("Chunk", null);
							for (Element kc: Chunk){
								File fc = new File(kc.getChildText("Path", null));
								
								//Starting CPL Finder
								CPLFinder cplf = new CPLFinder(amPath, fc.getName());
								cplf.find();
							}
						}
					}
					
			} 
			catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
}

