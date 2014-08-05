package com.uwetrottmann.tmdb.entities;

import com.uwetrottmann.tmdb.TmdbEntity;

public class Image implements TmdbEntity {
    public String file_path;

    public Integer width;

    public Integer height;

    public String iso_639_1;

    public Double aspect_ratio;
}
