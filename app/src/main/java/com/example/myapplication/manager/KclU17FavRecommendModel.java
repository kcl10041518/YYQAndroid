package com.example.myapplication.manager;

import java.util.List;

public class KclU17FavRecommendModel {


    /**
     * boyRd : {"percent":92,"comics":[{"comicId":99874,"name":"妖神记（全彩）","cover":"https://cover.u17i.com/2019/04/14550326_1554792353_LZ8l8ccNI5EP.sbig.jpg","chapterCount":450},{"comicId":71064,"name":"斗罗大陆","cover":"https://cover.u17i.com/2019/04/4276398_1555039348_G8ErrccS2fCS.sbig.jpg","chapterCount":497},{"comicId":149716,"name":"锁龙","cover":"https://cover.u17i.com/2017/04/4146390_1493184894_Yz1B62y4zr21.sbig.jpg","chapterCount":154},{"comicId":3166,"name":"镇魂街","cover":"https://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":298},{"comicId":195,"name":"雏蜂","cover":"https://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":324},{"comicId":121836,"name":"驭灵师","cover":"https://cover.u17i.com/2019/08/4486442_1564734359_mL8LG57wL8dL.sbig.jpg","chapterCount":413}]}
     * girlRd : {"percent":92,"comics":[{"comicId":112879,"name":"今天开始做明星","cover":"https://cover.u17i.com/2019/04/4486442_1556158160_zAtk4EYyl2qz.sbig.jpg","chapterCount":263},{"comicId":125783,"name":"王牌校草","cover":"https://cover.u17i.com/2019/04/13367798_1554271716_FMG86k0Z08j0.sbig.jpg","chapterCount":352},{"comicId":142882,"name":"恋与星途","cover":"https://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201},{"comicId":68109,"name":"蓝翅","cover":"https://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":378},{"comicId":136225,"name":"追星逐月","cover":"https://cover.u17i.com/2017/09/16737425_1505125937_0jP70z2jf7qK.sbig.jpg","chapterCount":203},{"comicId":3166,"name":"镇魂街","cover":"https://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":298}]}
     * favDefault : {"maxNum":5,"comics":[{"comicId":3166,"name":"镇魂街","cover":"https://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":298},{"comicId":149716,"name":"锁龙","cover":"https://cover.u17i.com/2017/04/4146390_1493184894_Yz1B62y4zr21.sbig.jpg","chapterCount":154},{"comicId":68471,"name":"鬼刀","cover":"https://cover.u17i.com/2017/09/4190552_1506057375_lklZN8Iw3084.sbig.jpg","chapterCount":41},{"comicId":8805,"name":"虎x鹤 妖师录","cover":"https://cover.u17i.com/2014/11/190368_1415172576_VxKFjWIDrphw.sbig.jpg","chapterCount":387},{"comicId":13707,"name":"端脑","cover":"https://cover.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","chapterCount":245},{"comicId":75859,"name":"噬规者","cover":"https://cover.u17i.com/2014/07/4431881_1405044822_6XsM9VnAV7nY.sbig.jpg","chapterCount":284},{"comicId":195,"name":"雏蜂","cover":"https://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":324},{"comicId":68109,"name":"蓝翅","cover":"https://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":378},{"comicId":142882,"name":"恋与星途","cover":"https://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201}]}
     */

    private BoyRdBean boyRd;
    private GirlRdBean girlRd;
    private FavDefaultBean favDefault;

    public BoyRdBean getBoyRd() {
        return boyRd;
    }

    public void setBoyRd(BoyRdBean boyRd) {
        this.boyRd = boyRd;
    }

    public GirlRdBean getGirlRd() {
        return girlRd;
    }

    public void setGirlRd(GirlRdBean girlRd) {
        this.girlRd = girlRd;
    }

    public FavDefaultBean getFavDefault() {
        return favDefault;
    }

    public void setFavDefault(FavDefaultBean favDefault) {
        this.favDefault = favDefault;
    }

    public static class BoyRdBean {
        /**
         * percent : 92
         * comics : [{"comicId":99874,"name":"妖神记（全彩）","cover":"https://cover.u17i.com/2019/04/14550326_1554792353_LZ8l8ccNI5EP.sbig.jpg","chapterCount":450},{"comicId":71064,"name":"斗罗大陆","cover":"https://cover.u17i.com/2019/04/4276398_1555039348_G8ErrccS2fCS.sbig.jpg","chapterCount":497},{"comicId":149716,"name":"锁龙","cover":"https://cover.u17i.com/2017/04/4146390_1493184894_Yz1B62y4zr21.sbig.jpg","chapterCount":154},{"comicId":3166,"name":"镇魂街","cover":"https://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":298},{"comicId":195,"name":"雏蜂","cover":"https://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":324},{"comicId":121836,"name":"驭灵师","cover":"https://cover.u17i.com/2019/08/4486442_1564734359_mL8LG57wL8dL.sbig.jpg","chapterCount":413}]
         */

        private int percent;
        private List<ComicsBean> comics;

        public int getPercent() {
            return percent;
        }

        public void setPercent(int percent) {
            this.percent = percent;
        }

        public List<ComicsBean> getComics() {
            return comics;
        }

        public void setComics(List<ComicsBean> comics) {
            this.comics = comics;
        }

        public static class ComicsBean {
            /**
             * comicId : 99874
             * name : 妖神记（全彩）
             * cover : https://cover.u17i.com/2019/04/14550326_1554792353_LZ8l8ccNI5EP.sbig.jpg
             * chapterCount : 450
             */

            private int comicId;
            private String name;
            private String cover;
            private int chapterCount;

            public int getComicId() {
                return comicId;
            }

            public void setComicId(int comicId) {
                this.comicId = comicId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getChapterCount() {
                return chapterCount;
            }

            public void setChapterCount(int chapterCount) {
                this.chapterCount = chapterCount;
            }
        }
    }

    public static class GirlRdBean {
        /**
         * percent : 92
         * comics : [{"comicId":112879,"name":"今天开始做明星","cover":"https://cover.u17i.com/2019/04/4486442_1556158160_zAtk4EYyl2qz.sbig.jpg","chapterCount":263},{"comicId":125783,"name":"王牌校草","cover":"https://cover.u17i.com/2019/04/13367798_1554271716_FMG86k0Z08j0.sbig.jpg","chapterCount":352},{"comicId":142882,"name":"恋与星途","cover":"https://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201},{"comicId":68109,"name":"蓝翅","cover":"https://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":378},{"comicId":136225,"name":"追星逐月","cover":"https://cover.u17i.com/2017/09/16737425_1505125937_0jP70z2jf7qK.sbig.jpg","chapterCount":203},{"comicId":3166,"name":"镇魂街","cover":"https://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":298}]
         */

        private int percent;
        private List<ComicsBeanX> comics;

        public int getPercent() {
            return percent;
        }

        public void setPercent(int percent) {
            this.percent = percent;
        }

        public List<ComicsBeanX> getComics() {
            return comics;
        }

        public void setComics(List<ComicsBeanX> comics) {
            this.comics = comics;
        }

        public static class ComicsBeanX {
            /**
             * comicId : 112879
             * name : 今天开始做明星
             * cover : https://cover.u17i.com/2019/04/4486442_1556158160_zAtk4EYyl2qz.sbig.jpg
             * chapterCount : 263
             */

            private int comicId;
            private String name;
            private String cover;
            private int chapterCount;

            public int getComicId() {
                return comicId;
            }

            public void setComicId(int comicId) {
                this.comicId = comicId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getChapterCount() {
                return chapterCount;
            }

            public void setChapterCount(int chapterCount) {
                this.chapterCount = chapterCount;
            }
        }
    }

    public static class FavDefaultBean {
        /**
         * maxNum : 5
         * comics : [{"comicId":3166,"name":"镇魂街","cover":"https://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":298},{"comicId":149716,"name":"锁龙","cover":"https://cover.u17i.com/2017/04/4146390_1493184894_Yz1B62y4zr21.sbig.jpg","chapterCount":154},{"comicId":68471,"name":"鬼刀","cover":"https://cover.u17i.com/2017/09/4190552_1506057375_lklZN8Iw3084.sbig.jpg","chapterCount":41},{"comicId":8805,"name":"虎x鹤 妖师录","cover":"https://cover.u17i.com/2014/11/190368_1415172576_VxKFjWIDrphw.sbig.jpg","chapterCount":387},{"comicId":13707,"name":"端脑","cover":"https://cover.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","chapterCount":245},{"comicId":75859,"name":"噬规者","cover":"https://cover.u17i.com/2014/07/4431881_1405044822_6XsM9VnAV7nY.sbig.jpg","chapterCount":284},{"comicId":195,"name":"雏蜂","cover":"https://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":324},{"comicId":68109,"name":"蓝翅","cover":"https://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":378},{"comicId":142882,"name":"恋与星途","cover":"https://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201}]
         */

        private int maxNum;
        private List<ComicsBeanXX> comics;

        public int getMaxNum() {
            return maxNum;
        }

        public void setMaxNum(int maxNum) {
            this.maxNum = maxNum;
        }

        public List<ComicsBeanXX> getComics() {
            return comics;
        }

        public void setComics(List<ComicsBeanXX> comics) {
            this.comics = comics;
        }

        public static class ComicsBeanXX {
            /**
             * comicId : 3166
             * name : 镇魂街
             * cover : https://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg
             * chapterCount : 298
             */

            private int comicId;
            private String name;
            private String cover;
            private int chapterCount;

            public int getComicId() {
                return comicId;
            }

            public void setComicId(int comicId) {
                this.comicId = comicId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getChapterCount() {
                return chapterCount;
            }

            public void setChapterCount(int chapterCount) {
                this.chapterCount = chapterCount;
            }
        }
    }
}
