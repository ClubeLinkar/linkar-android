package br.com.clubelinkar.android.util;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

/**
 * Created by Tushar Saha on 11/27/15.
 * Audacity IT Solutions Ltd.
 */
public class ImageUtils {

    public static void downloadImageUsingGlide(Context activity, final ImageView container, String url) {
        Glide.with(activity)
                .load(url)
                .placeholder(android.R.drawable.progress_indeterminate_horizontal)
                .into(container);
    }

    public static void downloadImageUsingPicasso(Context context, final ImageView container, String url) {
        Picasso.with(context)
                .load(url)
                .placeholder(android.R.drawable.progress_indeterminate_horizontal)
                .into(container);
    }
}
