package com.example.flowers;

import java.util.HashMap;
import 	android.graphics.Color;
public class ColorPalette {
    private HashMap<Integer,String> palette = new HashMap();

    public ColorPalette(){
        //Pink (default)
        palette.put(1,"ff4383");
        //Blue
        palette.put(2,"006aff");
        //Green
        palette.put(3,"00a714");
    }

    public int getParsedColor(int paletteSelection){
        if (palette.containsKey(paletteSelection)){
            return Color.parseColor(palette.get(paletteSelection));
        }else{
            //If the index doesn't exist return default color
            return Color.parseColor(palette.get(1));
        }
    }
}
