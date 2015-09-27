package rgun.vktestapp.photo;

import java.io.Serializable;

/**
 * Created by rgun on 24.09.15.
 */
public class PhotoPojo implements Serializable {

    private static final long serialVersionUID = -1097257131516796924L;

    public String name;
    public String url;

    public PhotoPojo(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
