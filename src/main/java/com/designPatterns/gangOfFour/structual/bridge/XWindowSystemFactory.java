package com.designPatterns.gangOfFour.structual.bridge;

import com.designPatterns.gangOfFour.structual.bridge.util.ColorImp;
import com.designPatterns.gangOfFour.structual.bridge.util.FontImp;
import com.designPatterns.gangOfFour.structual.bridge.util.XColorImp;
import com.designPatterns.gangOfFour.structual.bridge.util.XFontImp;

public class XWindowSystemFactory extends WindowSystemFactory {
	@Override
	public WindowImplementor createWindowImp() {
		return new XWindowImplementor();
	}

	@Override
	public ColorImp createColorlmp() {
		return new XColorImp();
	}

	@Override
	public FontImp createFontlmp() {
		return new XFontImp();
	}
}