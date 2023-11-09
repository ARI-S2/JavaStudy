package com.sist.common;

import javax.swing.*;
import java.awt.*;
public class ImageChange {

	public static Image getImage(ImageIcon icon,int w, int h) {
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);

	}

}
