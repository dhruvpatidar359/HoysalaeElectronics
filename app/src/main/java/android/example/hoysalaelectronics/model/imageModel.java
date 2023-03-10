package android.example.hoysalaelectronics.model;

import java.util.Locale;

public class imageModel {


    String tags;
    String webformatURL;

    public imageModel(String tags, String webformatURL, String largeImageURL, String id) {
        this.tags = tags;
        this.webformatURL = webformatURL;
        this.largeImageURL = largeImageURL;
        this.id = id;
    }

    String largeImageURL;
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }


    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }


    public String getWebformatURL() {
        return webformatURL;
    }

    public void setWebformatURL(String webformatURL) {
        this.webformatURL = webformatURL;
    }


    public String getTags() {
        return tags.split(",")[0].toUpperCase(Locale.ROOT);
    }

    public void setTags(String tags) {
        this.tags = tags;
    }


    public imageModel() {
    }

}
