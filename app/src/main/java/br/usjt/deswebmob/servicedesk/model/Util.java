package br.usjt.deswebmob.servicedesk.model;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

import br.usjt.deswebmob.servicedesk.R;

/**
 * Created by arqdsis on 22/03/2018.
 */

public class Util {
    public static Drawable getDrawableDinamic(Context context, String nomeImagem){
        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(nomeImagem);
            int id = idField.getInt(idField);
//            return context.getResources().getDrawable(id, null);
            return context.getResources().getDrawable(id);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
