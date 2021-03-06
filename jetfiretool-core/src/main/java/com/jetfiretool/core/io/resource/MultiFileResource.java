package com.jetfiretool.core.io.resource;

import java.io.File;
import java.util.Collection;

public class MultiFileResource extends MultiResource{
	
	/**
	 * 构造
	 * 
	 * @param files
	 */
	public MultiFileResource(Collection<File> files) {
		super();
		add(files);
	}
	
	/**
	 * 构造
	 * 
	 * @param files
	 */
	public MultiFileResource(File... files) {
		super();
		add(files);
	}
	
	/**
	 * 增加文件资源
	 * 
	 * @param files 文件资源
	 * @return this
	 */
	public MultiFileResource add(File... files) {
		for (File file : files) {
			this.add(new FileResource(file));
		}
		return this;
	}
	
	/**
	 * 增加文件资源
	 * 
	 * @param files 文件资源
	 * @return this
	 */
	public MultiFileResource add(Collection<File> files) {
		for (File file : files) {
			this.add(new FileResource(file));
		}
		return this;
	}
	
	@Override
	public MultiFileResource add(Resource resource) {
		return (MultiFileResource)super.add(resource);
	}
}
