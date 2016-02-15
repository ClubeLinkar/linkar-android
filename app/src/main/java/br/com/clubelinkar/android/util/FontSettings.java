package br.com.clubelinkar.android.util;


import android.content.Context;
import android.graphics.Typeface;

/**
 * @author Audacity IT Solutions Ltd.
 * @class FontSettings
 * @brief Class for getting typeface of desired font.
 */

public class FontSettings {
    public static Typeface typeFace = null;
    public Context context;

    public FontSettings(Context context) {
        this.context = context;
    }

    /**
     * @brief methods for getting the typeface of a desired font. To change the font copy new
     * font to the fonts inside asset folder. Also make necessary changes here.
     * @return Typeface
     */
    public Typeface getRobotoLightFont() {
        typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/roboto_light.ttf");
        return typeFace;
    }

}
