package com.example.mve_week2_01.bean;

import java.util.List;

public class NewsBean {

    /**
     * msg : 成功的返回
     * code : 1
     * data : [{"uniquekey":"1326bf3c4505783d4a964f81b6220e9d","title":"美国被特朗普坑惨了！又有3个铁杆盟友公开唱对台戏！","date":"2018-05-12 07:25","category":"头条","author_name":"大国军情","url":"http://mini.eastday.com/mobile/180512072544020.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180512/20180512_fe1bf1b6ec00098f9455c84dc81e6763_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180512/20180512_3f636fca330f2311583896aed3185196_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180512/20180512_793fab03dadcd417bf2d8e5e1e48a0f5_cover_mwpm_03200403.jpg"},{"uniquekey":"9db153b507c10bbbed1d26c29c030eef","title":"第71届戛纳电影节：贾樟柯电影《江湖儿女》首映","date":"2018-05-12 07:25","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/180512072505095.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180512/20180512072505_0fe08f494e7c090764244e3581b3e5ca_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180512/20180512072505_0fe08f494e7c090764244e3581b3e5ca_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180512/20180512072505_0fe08f494e7c090764244e3581b3e5ca_3_mwpm_03200403.jpg"},{"uniquekey":"4f47eb31b188cfa90881260bb2b11aa8","title":"以色列发射60枚火箭弹对伊朗进行报复，中东小霸王称号保不住了","date":"2018-05-12 07:24","category":"头条","author_name":"遇见优佳","url":"http://mini.eastday.com/mobile/180512072412903.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180512/20180512_38f5183808987be3783b180740d12a2a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180512/20180512_a3d9f98eb0e3fe36574581f00fa0f898_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180512/20180512_37fa1339af2e64cfd2dc85191950e8ba_cover_mwpm_03200403.jpg"},{"uniquekey":"a3ef77503b9924d7ad6957a5af5da5d1","title":"苏丹驻华大使送别招待会在公共外交文化交流中心举行","date":"2018-05-12 07:22","category":"头条","author_name":"国际在线","url":"http://mini.eastday.com/mobile/180512072229596.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180512/20180512072229_a296d945ae7fe08eed7d78060ce3f5c2_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180512/20180512072229_a296d945ae7fe08eed7d78060ce3f5c2_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180512/20180512072229_a296d945ae7fe08eed7d78060ce3f5c2_5_mwpm_03200403.jpg"},{"uniquekey":"b447b3941c73a35e587273a8a1b05c2d","title":"十九届三中全会以来推进党和国家机构改革述评","date":"2018-05-12 07:17","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/180512071745564.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180512/20180512071745_6accdc1c2a1356851f0bf51247a8f256_9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180512/20180512071745_6accdc1c2a1356851f0bf51247a8f256_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180512/20180512071745_6accdc1c2a1356851f0bf51247a8f256_4_mwpm_03200403.jpg"},{"uniquekey":"fc91bd75121e2e84a6cb3d239ddb9846","title":"太反常！特朗普声称退出伊核协议以来，伊朗的表现让美军不适应","date":"2018-05-12 07:15","category":"头条","author_name":"阿尔法军事","url":"http://mini.eastday.com/mobile/180512071539046.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180512/20180512_85e54ca8649794d2c3fdf06faf04fa87_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180512/20180512_e8df98afa3707e436d1793e66d5bc063_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180512/20180512_a1d1e3735f424eba66244a7842b2f7bf_cover_mwpm_03200403.jpg"},{"uniquekey":"ebed0b6a189873fa375a47ee8463c9be","title":"沪正在全面消除无证餐饮店铺 \u201c共享餐厅\u201d最快6月运营","date":"2018-05-12 07:13","category":"头条","author_name":"东方网","url":"http://mini.eastday.com/mobile/180512071324017.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180512/20180512071324_ae237ccc4fcee20ec4909588b5b7609f_1_mwpm_03200403.jpg"},{"uniquekey":"8a88eb5466a46cf6d975579ccb658e29","title":"特朗普嘲讽奥巴马：他花18亿救人，我让朝鲜免费放人","date":"2018-05-12 07:09","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512070940666.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180512/20180512070940_3108dd32b82c16f350b949340f95a647_1_mwpm_03200403.jpg"},{"uniquekey":"6113c546a13e9292ced28b0199a23108","title":"身在国外，这五点我必须说清楚！","date":"2018-05-12 07:03","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/180512070344831.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180512/20180512070344_7f0366d60dea69d79c1f0432600b5f20_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180512/20180512070344_7f0366d60dea69d79c1f0432600b5f20_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180512/20180512070344_7f0366d60dea69d79c1f0432600b5f20_3_mwpm_03200403.jpg"},{"uniquekey":"ca9d43ed0e6875692164bea6cc898065","title":"再\u201c读\u201d汶川｜究竟是一种什么样的力量，让中国人如此勇敢地面对可怕的灾难？","date":"2018-05-12 06:59","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512065922743.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180512/20180512065922_e367e5443f66512176376bd05ed65f9a_1_mwpm_03200403.jpg"},{"uniquekey":"da0a52bc92c10e81d16a4e728701cffc","title":"十年对比：通往汶川的唯一通道十年之变","date":"2018-05-12 06:50","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/180512065018882.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180512/20180512065018_01abef975bd32ccc728ac4e4e6a7ec6e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180512/20180512065018_9cfcb8c2869e997daf379bb7ce19180e_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180512/20180512065018_0b79422343a8c1c37ec8121cd0c7a11c_5_mwpm_03200403.jpg"},{"uniquekey":"fa498034a3f9cd9fa2f5e0a2fbfd4da4","title":"全国第一！上海的马路边，应该容得下更多街头艺人","date":"2018-05-12 06:49","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512064903130.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180512/20180512064903_6a2e203b71d2710aded08d300ab29eeb_1_mwpm_03200403.jpg"},{"uniquekey":"e1b21b938c2fc3a7345ca5bd93ab3d8e","title":"被吐槽演技差的宋茜这回动真格的，吴亦凡黄子韬们也跟上节奏了！","date":"2018-05-12 06:46","category":"头条","author_name":"网易越娱乐","url":"http://mini.eastday.com/mobile/180512064621690.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180512/20180512064621_bab229c7b39e6fa7e59dd27703ddfb38_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180512/20180512064621_bab229c7b39e6fa7e59dd27703ddfb38_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180512/20180512064621_bab229c7b39e6fa7e59dd27703ddfb38_1_mwpm_03200403.jpg"},{"uniquekey":"526a4c110dedc726aa4e53afbcbea23d","title":"美国重新制裁伊朗 德国经济界担忧遭连累","date":"2018-05-12 06:38","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512063843828.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180512/20180512063843_59894e298ee0432f1d141cb347f356c8_1_mwpm_03200403.jpg"},{"uniquekey":"e0a21ea66ac913345a3ddeef2de9acea","title":"马哈蒂尔宣布特赦前副总理安华 二十年前送其入狱","date":"2018-05-12 06:38","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512063843353.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180512/20180512063843_b6081361df8e6cd58b6d52035cb3ee3a_1_mwpm_03200403.jpg"},{"uniquekey":"06c93effa61afee08c768604e97de4d2","title":"日本二手店惊现陈水扁竞选外套 台网友酸：穿上之后手都不会抖了","date":"2018-05-12 06:38","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512063843086.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180512/20180512063843_a198728f6df54faf3ac82f9eff70a209_1_mwpm_03200403.jpg"},{"uniquekey":"ed31cf77aaf7073879898beaed6b172d","title":"10年过去了，他们还好吗","date":"2018-05-12 06:19","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/180512061919917.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180512/20180512061919_eae4ad26c428cc7f961a1d6cf6e4264e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180512/20180512061919_eae4ad26c428cc7f961a1d6cf6e4264e_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180512/20180512061919_eae4ad26c428cc7f961a1d6cf6e4264e_4_mwpm_03200403.jpg"},{"uniquekey":"fa422c905b7767276acd999a9439b43c","title":"新闻早餐：打捞人员发现疑似杀空姐嫌犯尸体 将做DNA鉴定","date":"2018-05-12 06:15","category":"头条","author_name":"新闻早餐","url":"http://mini.eastday.com/mobile/180512061559294.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180512/20180512_418566db5b32e600bc27d0bc8cb0a6a6_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180512/20180512_8d766fd5086f98ec8741ed44505ce35c_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180512/20180512_509df6c0c45109a6989bc86c663d02cd_cover_mwpm_03200403.jpg"},{"uniquekey":"92ee0d2a31867a8f215b0517d99a9409","title":"难忘救援经历 回忆激励前行 ","date":"2018-05-12 06:07","category":"头条","author_name":"大众网","url":"http://mini.eastday.com/mobile/180512060745166.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180512/20180512060745_78550703b206b53ace6a0c51b1d737d4_1_mwpm_03200403.jpg"},{"uniquekey":"164f8861bd6628737684dcff49f376d2","title":"回望汶川（下）| 房子差不多修好了，那么人呢？","date":"2018-05-12 06:07","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512060707642.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180512/20180512060707_4f667adcf6d62ec0b177add95ac037e9_1_mwpm_03200403.jpg"},{"uniquekey":"a8832fbcd574b6675c0cf3a0d37937bc","title":"竟为\u201c两岸一家亲\u201d向深绿道歉，谋求连任台北市长的柯文哲向蔡英文\u201c折腰认错\u201d","date":"2018-05-12 06:07","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512060707366.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180512/20180512060707_72a977a668e79cc22e88db944b2871ce_1_mwpm_03200403.jpg"},{"uniquekey":"92f7d43683b6d8b300ecb8888148d70e","title":"【钩沉】\u201c摸着石头过河\u201d，是邓小平的原创吗","date":"2018-05-12 06:07","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512060706828.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180512/20180512060706_82f81c098284dc2144d47776df34b478_1_mwpm_03200403.jpg"},{"uniquekey":"4ca3a79d5762fb1d130daeadfb1f7be9","title":"忠诚守护 老人被埋170小时 家中狗狗挣脱绳索陪伴不离","date":"2018-05-12 06:01","category":"头条","author_name":"中青在线","url":"http://mini.eastday.com/mobile/180512060138223.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180512/20180512060138_731141065c8389f053e98fd09959e9b2_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180512/20180512060138_731141065c8389f053e98fd09959e9b2_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180512/20180512060138_731141065c8389f053e98fd09959e9b2_3_mwpm_03200403.jpg"},{"uniquekey":"e93a1d8243a9037b1da76adc7a793739","title":"西安再添世界500强企业 将为大西安人才发展战略提供新动能","date":"2018-05-12 05:37","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/180512053736878.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180512/20180512053736_8f66fb9da7fc1f943a0ce8e61a694391_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180512/20180512053736_8f66fb9da7fc1f943a0ce8e61a694391_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180512/20180512053736_8f66fb9da7fc1f943a0ce8e61a694391_1_mwpm_03200403.jpg"},{"uniquekey":"b006b13ae3d14707f881eb92fc914ecd","title":"高速车道突然飞来轮胎 司机握紧方向盘救了一车游客","date":"2018-05-12 05:36","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/180512053627582.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180512/20180512053627_9945660161d740d7ed793166d7227a70_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180512/20180512053627_9945660161d740d7ed793166d7227a70_2_mwpm_03200403.jpg"},{"uniquekey":"94eee6750d18b56e69e7f21639e3e5f1","title":"早读｜上海将筹建\u201c中共一大纪念馆\u201d","date":"2018-05-12 05:36","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/180512053610949.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180512/20180512053610_4bc3792a8ae8dfa412a4da9f45478910_1_mwpm_03200403.jpg"},{"uniquekey":"fb1c5b67794834d0a6103a20b64854c0","title":"中国电子商务快速发展 给世界带来巨大商机","date":"2018-05-12 05:23","category":"头条","author_name":"西安晚报","url":"http://mini.eastday.com/mobile/180512052309026.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180512/20180512052309_d81eabc5f596d49d94d73f8b3fbc6a8c_1_mwpm_03200403.jpg"},{"uniquekey":"4aa30f5d94850ca14205845bc5847c5a","title":"\u201c竹简\u201d寄情 感恩父母","date":"2018-05-12 05:15","category":"头条","author_name":"大众网","url":"http://mini.eastday.com/mobile/180512051537520.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180512/20180512051537_1f79912ff681c7cc4a96a6f97f967479_1_mwpm_03200403.jpg"},{"uniquekey":"e491de85803b55c5412ad0fbb2346a87","title":"北京海运进出口货物七成走天津","date":"2018-05-12 05:07","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/180512050734360.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180512/20180512050734_de8eae16975f2ddf8223b7c549096c70_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180512/20180512050734_de8eae16975f2ddf8223b7c549096c70_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180512/20180512050734_de8eae16975f2ddf8223b7c549096c70_2_mwpm_03200403.jpg"},{"uniquekey":"2f2995abb898f94aeacecd6537013404","title":"生活中诱发痔疮的五个原因不可忽略, 痔疮的治疗方法","date":"2018-05-12 04:56","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/180512045657878.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180512/20180512045657_15014004f9669c5aee78579be692dd66_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180512/20180512045657_15014004f9669c5aee78579be692dd66_2_mwpm_03200403.jpg"}]
     */

    private String msg;
    private int code;
    private List<DataBean> data;
    private final int SUCCESS_CODE=1;
    public boolean isSuccess(){
        return SUCCESS_CODE==code;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * uniquekey : 1326bf3c4505783d4a964f81b6220e9d
         * title : 美国被特朗普坑惨了！又有3个铁杆盟友公开唱对台戏！
         * date : 2018-05-12 07:25
         * category : 头条
         * author_name : 大国军情
         * url : http://mini.eastday.com/mobile/180512072544020.html
         * thumbnail_pic_s : http://04.imgmini.eastday.com/mobile/20180512/20180512_fe1bf1b6ec00098f9455c84dc81e6763_cover_mwpm_03200403.jpg
         * thumbnail_pic_s02 : http://04.imgmini.eastday.com/mobile/20180512/20180512_3f636fca330f2311583896aed3185196_cover_mwpm_03200403.jpg
         * thumbnail_pic_s03 : http://04.imgmini.eastday.com/mobile/20180512/20180512_793fab03dadcd417bf2d8e5e1e48a0f5_cover_mwpm_03200403.jpg
         */

        private String uniquekey;
        private String title;
        private String date;
        private String category;
        private String author_name;
        private String url;
        private String thumbnail_pic_s;
        private String thumbnail_pic_s02;
        private String thumbnail_pic_s03;

        public String getUniquekey() {
            return uniquekey;
        }

        public void setUniquekey(String uniquekey) {
            this.uniquekey = uniquekey;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThumbnail_pic_s() {
            return thumbnail_pic_s;
        }

        public void setThumbnail_pic_s(String thumbnail_pic_s) {
            this.thumbnail_pic_s = thumbnail_pic_s;
        }

        public String getThumbnail_pic_s02() {
            return thumbnail_pic_s02;
        }

        public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
            this.thumbnail_pic_s02 = thumbnail_pic_s02;
        }

        public String getThumbnail_pic_s03() {
            return thumbnail_pic_s03;
        }

        public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
            this.thumbnail_pic_s03 = thumbnail_pic_s03;
        }
        public boolean hasImage(){
            return thumbnail_pic_s!=null&&thumbnail_pic_s02!=null&&thumbnail_pic_s03!=null;
        }
    }
}
