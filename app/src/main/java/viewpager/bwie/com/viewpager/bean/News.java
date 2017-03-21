package viewpager.bwie.com.viewpager.bean;

import java.util.List;

/**
 * 1. 类的用途
 * 2. @author : do  you  heat
 * 3. @date 2017/3/21 13:15
 */
public class News {

    /**
     * code : 200
     * data : {"banner":[{"id":"http://www.meirixue.com/zt/apph5/valentine/html/index.html","img":"http://img.dianfu.net/img/20160810/18771edd4ce28101278b941e88c7a5ee.jpg","order":"5","status":"1","title":"想不到你需要这样的另一半！","type":"1","url":"http://www.meirixue.com/zt/apph5/valentine/html/index.html"},{"id":"1965","img":"http://img.dianfu.net/img/20161107/b9a9593450233b02410035383bd7d163.jpg","order":"1","status":"1","title":"学霸君，带带我！","type":"2","url":"1965"}],"circle":[{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160628/b5cd189ae8a43c86d10f9523e778301f.jpg","n_brief":"月球探险点这里！好礼相送！","n_icon":"1","n_order":"1","n_post_count":"186","n_praise_count":"376","n_replay_count":"304","n_small_img":"http://img.dianfu.net/img/20160628/07ba9393f52ef5bfe3541b84bdb80f49.jpg","n_status":"1","n_title":"学霸挑战","n_user_count":"485","nid":"6"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160628/ef558b49730a059b6fb4b3f7e2c2e587.jpg","n_brief":"我们的美丽革命","n_icon":"0","n_order":"2","n_post_count":"98","n_praise_count":"113","n_replay_count":"53","n_small_img":"http://img.dianfu.net/img/20160627/9db1537a8875ce40066fcb1e8d7d4590.png","n_status":"1","n_title":"变美那些事","n_user_count":"401","nid":"7"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160627/c11f2376c4592fe14a3d6d9b737f19f0.jpg","n_brief":"爱生活更要精致生活","n_icon":"0","n_order":"3","n_post_count":"126","n_praise_count":"92","n_replay_count":"31","n_small_img":"http://img.dianfu.net/img/20160627/77f1074ae40027211053bf8ee4b72e68.png","n_status":"1","n_title":"晒生活","n_user_count":"246","nid":"10"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160628/6e78ff0ace4172b95cfc4b44cad41a04.jpg","n_brief":"藏在心底的悄悄话","n_icon":"0","n_order":"4","n_post_count":"98","n_praise_count":"52","n_replay_count":"22","n_small_img":"http://img.dianfu.net/img/20160628/f2ee91f32361e13c0b89c0316a277f87.jpg","n_status":"1","n_title":"心事儿","n_user_count":"206","nid":"11"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160628/bd0b1e372b2ae8894ccd94436dd86d18.jpg","n_brief":"有些事不吐不快","n_icon":"0","n_order":"5","n_post_count":"153","n_praise_count":"46","n_replay_count":"51","n_small_img":"http://img.dianfu.net/img/20160627/5a89558c1fafdb6810d3f23a52510f85.png","n_status":"1","n_title":"就是要吐槽","n_user_count":"131","nid":"9"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160628/d216de095c56369b3c074282807338e7.jpg","n_brief":"与志趣相投的伙伴，热血天涯！","n_icon":"0","n_order":"6","n_post_count":"88","n_praise_count":"46","n_replay_count":"25","n_small_img":"http://img.dianfu.net/img/20160628/6ea37a450f96eee9a23a84e48260f386.png","n_status":"1","n_title":"兴趣互助小组","n_user_count":"136","nid":"13"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160628/c7aeb7d8c2765463d6074c84c5b525fa.jpg","n_brief":"瘦腿翘臀马甲线","n_icon":"0","n_order":"7","n_post_count":"116","n_praise_count":"44","n_replay_count":"4","n_small_img":"http://img.dianfu.net/img/20160628/2ea609d3057a74e53d5369afcce84dbd.jpg","n_status":"1","n_title":"健身减脂","n_user_count":"245","nid":"8"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160628/ac40235ec1e6ebe22ddf4b683f1a8a7c.jpg","n_brief":"个性穿搭潮流风向","n_icon":"0","n_order":"8","n_post_count":"83","n_praise_count":"90","n_replay_count":"13","n_small_img":"http://img.dianfu.net/img/20160628/f6524a5ca89375b3a089144fef32aac5.jpg","n_status":"1","n_title":"流行范","n_user_count":"197","nid":"12"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160628/07fa5cb5258924f4dc965243a8749970.jpg","n_brief":"用美食拯救世界","n_icon":"0","n_order":"9","n_post_count":"167","n_praise_count":"36","n_replay_count":"18","n_small_img":"http://img.dianfu.net/img/20160629/a997d2062a46e0d640b4fb258fc4127e.jpg","n_status":"1","n_title":"吃货控","n_user_count":"133","nid":"14"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160627/3f8ee6a7062fec1739d1753841569ebd.jpg","n_brief":"我们不黑处女座","n_icon":"0","n_order":"10","n_post_count":"169","n_praise_count":"138","n_replay_count":"59","n_small_img":"http://img.dianfu.net/img/20160627/75b2a4745cbf826efb102681d207b608.png","n_status":"1","n_title":"十二星玄机","n_user_count":"160","nid":"15"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160719/70a2a989e77085d0760a01eeb753af54.jpg","n_brief":"爱上文艺，不能自拔","n_icon":"2","n_order":"11","n_post_count":"54","n_praise_count":"39","n_replay_count":"6","n_small_img":"http://img.dianfu.net/img/20160719/3ebf3797a07409fc20efce2e63d8dd01.png","n_status":"1","n_title":"偏爱文艺","n_user_count":"201","nid":"17"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160719/2a715fda3f0ccd1437ed174f137b6676.png","n_brief":"我要出去野","n_icon":"2","n_order":"12","n_post_count":"4","n_praise_count":"12","n_replay_count":"4","n_small_img":"http://img.dianfu.net/img/20160719/6c701b51a1d8a563522e330c3ad07f28.png","n_status":"1","n_title":"爱旅行","n_user_count":"113","nid":"16"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160719/2e5dbb10dc81a883c28e8f97fdda3a78.jpg","n_brief":"好书留香，观影有感","n_icon":"2","n_order":"13","n_post_count":"34","n_praise_count":"19","n_replay_count":"1","n_small_img":"http://img.dianfu.net/img/20160719/dec28ba8ea8bb26dd911d7eae4b2d072.png","n_status":"1","n_title":"读书&影评","n_user_count":"179","nid":"20"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160719/f06f6e96f83a9b104f0ab8b0c8406dec.jpg","n_brief":"寻找音乐路上的同伴","n_icon":"0","n_order":"14","n_post_count":"11","n_praise_count":"15","n_replay_count":"4","n_small_img":"http://img.dianfu.net/img/20160719/c7cb5708d5874ae0915a59466292f6f6.png","n_status":"1","n_title":"玩乐器","n_user_count":"132","nid":"19"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160728/67f94ce9c810df4f54949374663db417.png","n_brief":"手作是一种生活态度","n_icon":"0","n_order":"15","n_post_count":"30","n_praise_count":"8","n_replay_count":"4","n_small_img":"http://img.dianfu.net/img/20160719/234c580a1dab7d7cdc4db9e98e7a28a3.png","n_status":"1","n_title":"手作工坊","n_user_count":"175","nid":"22"},{"is_commend":"0","n_big_img":"http://img.dianfu.net/img/20160719/ef478f47738f71b49c5c06aad5aad62c.jpg","n_brief":"用镜头发现美","n_icon":"2","n_order":"16","n_post_count":"76","n_praise_count":"26","n_replay_count":"8","n_small_img":"http://img.dianfu.net/img/20160719/1a103f79f4739e54f70142158f948999.png","n_status":"1","n_title":"摄影","n_user_count":"154","nid":"21"}]}
     * msg : 请求成功
     */

    private int code;
    private DataBean data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        private List<BannerBean> banner;
        private List<CircleBean> circle;

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<CircleBean> getCircle() {
            return circle;
        }

        public void setCircle(List<CircleBean> circle) {
            this.circle = circle;
        }

        public static class BannerBean {
            /**
             * id : http://www.meirixue.com/zt/apph5/valentine/html/index.html
             * img : http://img.dianfu.net/img/20160810/18771edd4ce28101278b941e88c7a5ee.jpg
             * order : 5
             * status : 1
             * title : 想不到你需要这样的另一半！
             * type : 1
             * url : http://www.meirixue.com/zt/apph5/valentine/html/index.html
             */

            private String id;
            private String img;
            private String order;
            private String status;
            private String title;
            private String type;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class CircleBean {
            /**
             * is_commend : 0
             * n_big_img : http://img.dianfu.net/img/20160628/b5cd189ae8a43c86d10f9523e778301f.jpg
             * n_brief : 月球探险点这里！好礼相送！
             * n_icon : 1
             * n_order : 1
             * n_post_count : 186
             * n_praise_count : 376
             * n_replay_count : 304
             * n_small_img : http://img.dianfu.net/img/20160628/07ba9393f52ef5bfe3541b84bdb80f49.jpg
             * n_status : 1
             * n_title : 学霸挑战
             * n_user_count : 485
             * nid : 6
             */

            private String is_commend;
            private String n_big_img;
            private String n_brief;
            private String n_icon;
            private String n_order;
            private String n_post_count;
            private String n_praise_count;
            private String n_replay_count;
            private String n_small_img;
            private String n_status;
            private String n_title;
            private String n_user_count;
            private String nid;

            public String getIs_commend() {
                return is_commend;
            }

            public void setIs_commend(String is_commend) {
                this.is_commend = is_commend;
            }

            public String getN_big_img() {
                return n_big_img;
            }

            public void setN_big_img(String n_big_img) {
                this.n_big_img = n_big_img;
            }

            public String getN_brief() {
                return n_brief;
            }

            public void setN_brief(String n_brief) {
                this.n_brief = n_brief;
            }

            public String getN_icon() {
                return n_icon;
            }

            public void setN_icon(String n_icon) {
                this.n_icon = n_icon;
            }

            public String getN_order() {
                return n_order;
            }

            public void setN_order(String n_order) {
                this.n_order = n_order;
            }

            public String getN_post_count() {
                return n_post_count;
            }

            public void setN_post_count(String n_post_count) {
                this.n_post_count = n_post_count;
            }

            public String getN_praise_count() {
                return n_praise_count;
            }

            public void setN_praise_count(String n_praise_count) {
                this.n_praise_count = n_praise_count;
            }

            public String getN_replay_count() {
                return n_replay_count;
            }

            public void setN_replay_count(String n_replay_count) {
                this.n_replay_count = n_replay_count;
            }

            public String getN_small_img() {
                return n_small_img;
            }

            public void setN_small_img(String n_small_img) {
                this.n_small_img = n_small_img;
            }

            public String getN_status() {
                return n_status;
            }

            public void setN_status(String n_status) {
                this.n_status = n_status;
            }

            public String getN_title() {
                return n_title;
            }

            public void setN_title(String n_title) {
                this.n_title = n_title;
            }

            public String getN_user_count() {
                return n_user_count;
            }

            public void setN_user_count(String n_user_count) {
                this.n_user_count = n_user_count;
            }

            public String getNid() {
                return nid;
            }

            public void setNid(String nid) {
                this.nid = nid;
            }
        }
    }
}
