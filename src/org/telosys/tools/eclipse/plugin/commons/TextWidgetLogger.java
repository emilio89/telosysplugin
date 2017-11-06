package org.telosys.tools.eclipse.plugin.commons;

/**
 *  
 * 
 * @author Laurent GUERIN
 *
 */
public class TextWidgetLogger extends org.telosys.tools.commons.logger.GenericLogger
{
	private StringBuilder  stringBuilder = new StringBuilder() ;
	
	//----------------------------------------------------------------------------------
	public TextWidgetLogger() {
		super();
	}
	//----------------------------------------------------------------------------------
	protected void print(String s) {
		stringBuilder.append( s + "\n");
	}
	//----------------------------------------------------------------------------------
	public String getContent() {
		return stringBuilder.toString();
	}
	//----------------------------------------------------------------------------------
	public void clear() {
		stringBuilder = new StringBuilder() ;
	}

}
