/*
 * Copyright 2014 Chris Banes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.uwetrottmann.tmdb.entities;

import com.uwetrottmann.tmdb.TmdbEntity;

import java.util.Date;
import java.util.List;

public class PersonCredits implements TmdbEntity {

    private static final long serialVersionUID = -7947291466017850804L;

    public Integer id;

    public List<CastCredit> cast;

    public List<CrewCredit> crew;

    public static class CastCredit implements TmdbEntity {

        private static final long serialVersionUID = -6164786116196155740L;

        public Integer id;

        public String credit_id;

        public String character;

        public String poster_path;

        public String media_type;

        // Movie specific fields

        public String title;

        public Date release_date;

        // TV specific fields

        public String name;

        public Date first_air_date;

        public Integer episode_count;
    }

    public static class CrewCredit implements TmdbEntity {

        private static final long serialVersionUID = -6267166779666363892L;

        public Integer id;

        public String credit_id;

        public String department;

        public String job;

        public String poster_path;

        public String media_type;

        // Movie specific fields

        public String title;

        public Date release_date;

        // TV specific fields

        public String name;
    }

}
