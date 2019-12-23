package com.designPatterns.gangOfFour.structual.bridge;

import com.designPatterns.gangOfFour.structual.bridge.util.ColorImp;
import com.designPatterns.gangOfFour.structual.bridge.util.FontImp;
import com.designPatterns.gangOfFour.structual.bridge.util.PmColorImp;
import com.designPatterns.gangOfFour.structual.bridge.util.PmFontImp;

public class PmWindowSystemFactory extends WindowSystemFactory {
	
	@Override
	public WindowImplementor createWindowImp() {
		return new PmWindowImplementor();
	}

	@Override
	public ColorImp createColorlmp() {
		return new PmColorImp();
	}

	@Override
	public FontImp createFontlmp() {
		return new PmFontImp();
	}
};