package com.example.moviesapp.data.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

public class ModelMovies {


    /**
     * page : 1
     * results : [{"adult":false,"backdrop_path":"/xg27NrXi7VXCGUr7MG75UqLl6Vg.jpg","genre_ids":[16,10751,12,35],"id":1022789,"original_language":"en","original_title":"Inside Out 2","overview":"Teenager Riley's mind headquarters is undergoing a sudden demolition to make room for something entirely unexpected: new Emotions! Joy, Sadness, Anger, Fear and Disgust, who\u2019ve long been running a successful operation by all accounts, aren\u2019t sure how to feel when Anxiety shows up. And it looks like she\u2019s not alone.","popularity":5142.888,"poster_path":"/vpnVM9B6NMmQpWeZvzLvDESb2QY.jpg","release_date":"2024-06-11","title":"Inside Out 2","video":false,"vote_average":7.756,"vote_count":1047},{"adult":false,"backdrop_path":"/wNAhuOZ3Zf84jCIlrcI6JhgmY5q.jpg","genre_ids":[28,12,878],"id":786892,"original_language":"en","original_title":"Furiosa: A Mad Max Saga","overview":"As the world fell, young Furiosa is snatched from the Green Place of Many Mothers and falls into the hands of a great Biker Horde led by the Warlord Dementus. Sweeping through the Wasteland they come across the Citadel presided over by The Immortan Joe. While the two Tyrants war for dominance, Furiosa must survive many trials as she puts together the means to find her way home.","popularity":4252.2,"poster_path":"/iADOJ8Zymht2JPMoy3R7xceZprc.jpg","release_date":"2024-05-22","title":"Furiosa: A Mad Max Saga","video":false,"vote_average":7.716,"vote_count":1382},{"adult":false,"backdrop_path":"/fqv8v6AycXKsivp1T5yKtLbGXce.jpg","genre_ids":[878,12,28],"id":653346,"original_language":"en","original_title":"Kingdom of the Planet of the Apes","overview":"Several generations in the future following Caesar's reign, apes are now the dominant species and live harmoniously while humans have been reduced to living in the shadows. As a new tyrannical ape leader builds his empire, one young ape undertakes a harrowing journey that will cause him to question all that he has known about the past and to make choices that will define a future for apes and humans alike.","popularity":2097.933,"poster_path":"/gKkl37BQuKTanygYQG1pyYgLVgf.jpg","release_date":"2024-05-08","title":"Kingdom of the Planet of the Apes","video":false,"vote_average":6.869,"vote_count":1264},{"adult":false,"backdrop_path":"/j29ekbcLpBvxnGk6LjdTc2EI5SA.jpg","genre_ids":[16,10751,12,18,35],"id":150540,"original_language":"en","original_title":"Inside Out","overview":"When 11-year-old Riley moves to a new city, her Emotions team up to help her through the transition. Joy, Fear, Anger, Disgust and Sadness work together, but when Joy and Sadness get lost, they must journey through unfamiliar places to get back home.","popularity":1595.877,"poster_path":"/2H1TmgdfNtsKlU9jKdeNyYL5y8T.jpg","release_date":"2015-06-17","title":"Inside Out","video":false,"vote_average":7.915,"vote_count":20935},{"adult":false,"backdrop_path":"/gRApXuxWmO2forYTuTmcz5RaNUV.jpg","genre_ids":[28,80,53,35],"id":573435,"original_language":"en","original_title":"Bad Boys: Ride or Die","overview":"After their late former Captain is framed, Lowrey and Burnett try to clear his name, only to end up on the run themselves.","popularity":1371.294,"poster_path":"/nP6RliHjxsz4irTKsxe8FRhKZYl.jpg","release_date":"2024-06-05","title":"Bad Boys: Ride or Die","video":false,"vote_average":6.992,"vote_count":454},{"adult":false,"backdrop_path":"/jvPMJ2zM92jfXxVEFsqP1MMrLaO.jpg","genre_ids":[878,28,12],"id":823464,"original_language":"en","original_title":"Godzilla x Kong: The New Empire","overview":"Following their explosive showdown, Godzilla and Kong must reunite against a colossal undiscovered threat hidden within our world, challenging their very existence \u2013 and our own.","popularity":1248.903,"poster_path":"/z1p34vh7dEOnLDmyCrlUVLuoDzd.jpg","release_date":"2024-03-27","title":"Godzilla x Kong: The New Empire","video":false,"vote_average":7.2,"vote_count":2948},{"adult":false,"backdrop_path":"/fZv4EldEPurSz0d2uVIoL4Sng8x.jpg","genre_ids":[28,18,53],"id":1016346,"original_language":"bn","original_title":"MR-9: Do or Die","overview":"Masud Rana is a Secret Agent with code name MR-9 of the Bangladesh Counter Intelligence Agency","popularity":1214.944,"poster_path":"/geAWZUshBg4hS8TIeLOEhJbglpo.jpg","release_date":"2023-08-25","title":"MR-9: Do or Die","video":false,"vote_average":6.564,"vote_count":86},{"adult":false,"backdrop_path":"/iTWrsOVsUqcwYSxrpINNs3hG2nC.jpg","genre_ids":[53,27,28,9648],"id":1001311,"original_language":"fr","original_title":"Sous la Seine","overview":"In the Summer of 2024, Paris is hosting the World Triathlon Championships on the Seine for the first time. Sophia, a brilliant scientist, learns from Mika, a young environmental activist, that a large shark is swimming deep in the river. To avoid a bloodbath at the heart of the city, they have no choice but to join forces with Adil, the Seine river police commander.","popularity":1196.415,"poster_path":"/3GuTGq5IhoGqfZIFY7opswRI6Fe.jpg","release_date":"2024-06-05","title":"Under Paris","video":false,"vote_average":6.051,"vote_count":766},{"adult":false,"backdrop_path":"/z121dSTR7PY9KxKuvwiIFSYW8cf.jpg","genre_ids":[10752,28,18],"id":929590,"original_language":"en","original_title":"Civil War","overview":"In the near future, a group of war journalists attempt to survive while reporting the truth as the United States stands on the brink of civil war.","popularity":1088.85,"poster_path":"/sh7Rg8Er3tFcN9BpKIPOMvALgZd.jpg","release_date":"2024-04-10","title":"Civil War","video":false,"vote_average":7.006,"vote_count":1740},{"adult":false,"backdrop_path":"/aATi2PtaOQCVAquCym6OU0Z4FjY.jpg","genre_ids":[28,80,53],"id":704673,"original_language":"en","original_title":"Trigger Warning","overview":"A Special Forces commando uncovers a dangerous conspiracy when she returns to her hometown looking for answers into her beloved father's death.","popularity":1003.673,"poster_path":"/3Upk7iUi5cIsDJm5QlnzaHILHN8.jpg","release_date":"2024-06-20","title":"Trigger Warning","video":false,"vote_average":5.73,"vote_count":189},{"adult":false,"backdrop_path":"/1XyIHrP7X7rn3UBkNy9hPb9vCUf.jpg","genre_ids":[27,878,53,18],"id":762441,"original_language":"en","original_title":"A Quiet Place: Day One","overview":"As New York City is invaded by alien creatures who hunt by sound, a woman named Sammy fights to survive.","popularity":967.527,"poster_path":"/yrpPYKijwdMHyTGIOd1iK1h0Xno.jpg","release_date":"2024-06-26","title":"A Quiet Place: Day One","video":false,"vote_average":7.1,"vote_count":94},{"adult":false,"backdrop_path":"/nxxCPRGTzxUH8SFMrIsvMmdxHti.jpg","genre_ids":[35,14,10751],"id":639720,"original_language":"en","original_title":"IF","overview":"A young girl who goes through a difficult experience begins to see everyone's imaginary friends who have been left behind as their real-life friends have grown up.","popularity":900.59,"poster_path":"/xbKFv4KF3sVYuWKllLlwWDmuZP7.jpg","release_date":"2024-05-08","title":"IF","video":false,"vote_average":7.426,"vote_count":465},{"adult":false,"backdrop_path":"/fDmci71SMkfZM8RnCuXJVDPaSdE.jpg","genre_ids":[16,10751,35,28],"id":519182,"original_language":"en","original_title":"Despicable Me 4","overview":"Gru and Lucy and their girls \u2014 Margo, Edith and Agnes \u2014 welcome a new member to the Gru family, Gru Jr., who is intent on tormenting his dad. Gru faces a new nemesis in Maxime Le Mal and his femme fatale girlfriend Valentina, and the family is forced to go on the run.","popularity":893.728,"poster_path":"/wWba3TaojhK7NdycRhoQpsG0FaH.jpg","release_date":"2024-06-20","title":"Despicable Me 4","video":false,"vote_average":8.586,"vote_count":58},{"adult":false,"backdrop_path":"/w2zsNG7WKBMH35QqcFYILEAdYDU.jpg","genre_ids":[14,12,10751],"id":1026999,"original_language":"pl","original_title":"Akademia Pana Kleksa","overview":"A seemingly ordinary girl finds her way into the eponymous Academy to explore the world of fairy tales, imagination and creativity. With the help of a crazy, talented teacher, she develops her unique abilities and also stumbles upon a clue that will help her unravel the biggest secret of the family...","popularity":810.356,"poster_path":"/ymbECZscR8BTkdvXziSinMIckAz.jpg","release_date":"2024-01-05","title":"Kleks Academy","video":false,"vote_average":6.115,"vote_count":48},{"adult":false,"backdrop_path":"/vblTCXOWUQGSc837vgbhDRi4HSc.jpg","genre_ids":[28,80,35,53],"id":955555,"original_language":"ko","original_title":"The Roundup: Punishment","overview":"Detective Ma Seok-do changes his affiliation from the Geumcheon Police Station to the Metropolitan Investigation Team, in order to eradicate Japanese gangsters who enter Korea to commit heinous crimes.","popularity":806.646,"poster_path":"/lW6IHrtaATxDKYVYoQGU5sh0OVm.jpg","release_date":"2023-05-31","title":"The Roundup: No Way Out","video":false,"vote_average":7.2,"vote_count":329},{"adult":false,"backdrop_path":"/oZDRuGHhe5uY8wBqFJcJZT9kdvJ.jpg","genre_ids":[27,9648,14],"id":1086747,"original_language":"en","original_title":"The Watchers","overview":"A young artist gets stranded in an extensive, immaculate forest in western Ireland, where, after finding shelter, she becomes trapped alongside three strangers, stalked by mysterious creatures each night.","popularity":788.005,"poster_path":"/vZVEUPychdvZLrTNwWErr9xZFmu.jpg","release_date":"2024-06-06","title":"The Watchers","video":false,"vote_average":6.291,"vote_count":215},{"adult":false,"backdrop_path":"/g5Ha2DhXIuxsUl4gaDnbw3jOAlo.jpg","genre_ids":[28],"id":1115623,"original_language":"en","original_title":"The Last Kumite","overview":"When Karate champion Michael Rivers wins the last tournament of his career, shady businessman Ron Hall offers him the opportunity to fight in an illegal Kumite in Bulgaria against the world\u2019s best martial artists.  When Michael declines, Hall has his daughter kidnapped and, in order to rescue her, Rivers is left with no choice but to compete in the deadly tournament. Arriving in Bulgaria, he finds out that he is not the only fighter whose loved one was taken. Rivers enlists the help of trainers Master Loren, and Julie Jackson but will it be enough for him to win the tournament and save his daughter\u2019s life?","popularity":720.423,"poster_path":"/zDkaJgsPoSqa2cMe2hW2HAfyWwO.jpg","release_date":"2024-05-09","title":"The Last Kumite","video":false,"vote_average":7.148,"vote_count":54},{"adult":false,"backdrop_path":"/kYgQzzjNis5jJalYtIHgrom0gOx.jpg","genre_ids":[16,28,10751,35,14],"id":1011985,"original_language":"en","original_title":"Kung Fu Panda 4","overview":"Po is gearing up to become the spiritual leader of his Valley of Peace, but also needs someone to take his place as Dragon Warrior. As such, he will train a new kung fu practitioner for the spot and will encounter a villain called the Chameleon who conjures villains from the past.","popularity":718.033,"poster_path":"/kDp1vUBnMpe8ak4rjgl3cLELqjU.jpg","release_date":"2024-03-02","title":"Kung Fu Panda 4","video":false,"vote_average":7.13,"vote_count":2146},{"adult":false,"backdrop_path":"/3TNSoa0UHGEzEz5ndXGjJVKo8RJ.jpg","genre_ids":[878,28],"id":614933,"original_language":"en","original_title":"Atlas","overview":"A brilliant counterterrorism analyst with a deep distrust of AI discovers it might be her only hope when a mission to capture a renegade robot goes awry.","popularity":608.629,"poster_path":"/bcM2Tl5HlsvPBnL8DKP9Ie6vU4r.jpg","release_date":"2024-05-23","title":"Atlas","video":false,"vote_average":6.818,"vote_count":909},{"adult":false,"backdrop_path":"/SI22DaQXIfDvLrNBHGpSVShrsC.jpg","genre_ids":[16,878,10751,28],"id":829402,"original_language":"en","original_title":"Ultraman: Rising","overview":"With Tokyo under attack from kaiju, Ultraman discovers his greatest challenge isn\u2019t fighting giant monsters - it\u2019s raising one.","popularity":589.054,"poster_path":"/j886YEkIUsiImY53px5VHKD4lRa.jpg","release_date":"2024-06-14","title":"Ultraman: Rising","video":false,"vote_average":8.423,"vote_count":136}]
     * total_pages : 44866
     * total_results : 897303
     */

    private int page;
    private int total_pages;
    private int total_results;
    private List<ResultsBean> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }


    @Entity
    public static class ResultsBean {
        /**
         * adult : false
         * backdrop_path : /xg27NrXi7VXCGUr7MG75UqLl6Vg.jpg
         * genre_ids : [16,10751,12,35]
         * id : 1022789
         * original_language : en
         * original_title : Inside Out 2
         * overview : Teenager Riley's mind headquarters is undergoing a sudden demolition to make room for something entirely unexpected: new Emotions! Joy, Sadness, Anger, Fear and Disgust, who’ve long been running a successful operation by all accounts, aren’t sure how to feel when Anxiety shows up. And it looks like she’s not alone.
         * popularity : 5142.888
         * poster_path : /vpnVM9B6NMmQpWeZvzLvDESb2QY.jpg
         * release_date : 2024-06-11
         * title : Inside Out 2
         * video : false
         * vote_average : 7.756
         * vote_count : 1047
         */

        private boolean adult;
        private String backdrop_path;
        @PrimaryKey
        private int id;
        private String original_language;
        private String original_title;
        private String overview;
        private double popularity;
        private String poster_path;
        private String release_date;
        private String title;
        private boolean video;
        private double vote_average;
        private int vote_count;
        private List<Integer> genre_ids;

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public double getVote_average() {
            return vote_average;
        }

        public void setVote_average(double vote_average) {
            this.vote_average = vote_average;
        }

        public int getVote_count() {
            return vote_count;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
        }

        public void setGenre_ids(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }
    }
}
