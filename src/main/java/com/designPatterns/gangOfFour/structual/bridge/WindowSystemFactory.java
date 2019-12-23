package com.designPatterns.gangOfFour.structual.bridge;

import com.designPatterns.gangOfFour.structual.bridge.util.ColorImp;
import com.designPatterns.gangOfFour.structual.bridge.util.FontImp;

// WindowSystemFactory provides an interface for creating different
// kinds of window system-dependent implementation objects
public abstract class WindowSystemFactory {
	
	public abstract WindowImplementor createWindowImp();
	public abstract ColorImp createColorlmp();
	public abstract FontImp createFontlmp();
	// a "Create..." operation for all window system resources
	
}