package com.levelup.picturecache.loaders;

import android.widget.ImageView;

import com.levelup.picturecache.transforms.bitmap.BitmapTransform;
import com.levelup.picturecache.transforms.storage.StorageTransform;


/**
 * class used by the picture cache to display bitmaps on an {@link ImageView}, the default placeholder is defined by a resource ID
 * <p>
 * it also handles the Bitmaps transformations use for storage and/or display
 */
public class ImageViewLoaderDefaultResource extends ImageViewLoader {
	private final int defaultDrawable;

	/**
	 * constructor of the {@link ImageViewLoaderDefaultResource}
	 * @param view the ImageView on which the loaded bitmap will be displayed
	 * @param defaultResourceId the resource ID of a drawable to be used as placeholder while the bitmap is loading, may be {@code android.R.color.transparent}
	 * @param storageTransform the transformation to use before storing the bitmap in the cache
	 * @param loadTransform the non-persistent transformation to use on the bitmap before displaying it
	 */
	public ImageViewLoaderDefaultResource(ImageView view, int defaultResourceId, StorageTransform storageTransform, BitmapTransform loadTransform) {
		super(view, storageTransform, loadTransform);
		this.defaultDrawable = defaultResourceId;
	}

	/**
	 * display the default view, called in the UI thread
	 * called under a lock on {@link view}
	 */
	protected void displayDefaultView() {
		getImageView().setImageResource(defaultDrawable);
	}
}