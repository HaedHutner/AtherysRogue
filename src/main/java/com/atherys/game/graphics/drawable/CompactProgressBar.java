package com.atherys.game.graphics.drawable;

import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.graphics.TextGraphics;

public class CompactProgressBar extends ProgressBar {
    public CompactProgressBar(String title, int x, int y, int w, double initialProgress, double max, TextCharacter filler) {
        super(title, x, y, w, initialProgress, max, filler);
    }

    @Override
    public void apply(TextGraphics surface) {
        surface.putString(x, y, title);
        surface.setCharacter(x + title.length(), y, '[');
        surface.setCharacter(x + w, y, ']');
        for ( int i = title.length() + 1; i < ( title.length() + 1 + w ) * progress; i++ ) {
            surface.setCharacter(x + i, y, filler);
        }
    }
}
