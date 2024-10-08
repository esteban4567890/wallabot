package bot.config;

import java.util.ArrayList;
import java.util.List;

public class Config {

    private Auth auth;
    private List<Search> searches;

    public Config() {
        this.auth = new Auth();
        this.auth.setVintedBearerToken("example_vinted_bearer_token");
        this.auth.setVintedRefreshToken("example_vinted_refresh_token");
        this.auth.setWallapopBearerToken("example_wallapop_bearer_token");
        this.searches = new ArrayList<>();
        Search exampleSearch = new Search();
        exampleSearch.webhook_url = "http://example.com/webhook";
        exampleSearch.keywords = "example keywords";
        exampleSearch.latitude = 40.7128;
        exampleSearch.longitude = -74.0060;
        exampleSearch.min_price = 10;
        exampleSearch.max_price = 100;
        exampleSearch.delay = 5000;
        this.searches.add(exampleSearch);
    }

    public Auth getAuth() {
        return auth;
    }

    public List<Search> getSearches() {
        return searches;
    }

    public static class Auth {
        private String wallapop_bearer_token;
        private String vinted_bearer_token;
        private String vinted_refresh_token;

        public String getVintedBearerToken() {
            return vinted_bearer_token;
        }

        public String getVintedRefreshToken() {
            return vinted_refresh_token;
        }

        public void setWallapopBearerToken(String wallapop_bearer_token) {
            this.wallapop_bearer_token = wallapop_bearer_token;
        }

        public void setVintedRefreshToken(String vinted_refresh_token) {
            this.vinted_refresh_token = vinted_refresh_token;
        }

        public void setVintedBearerToken(String vinted_bearer_token) {
            this.vinted_bearer_token = vinted_bearer_token;
        }

        public String getWallapopBearerToken() {
            return wallapop_bearer_token;
        }
    }

    public static class Search {
        private String webhook_url;
        private String keywords;
        private double latitude;
        private double longitude;
        private int min_price;
        private int max_price;
        private long delay;

        public String getWebhookUrl() {
            return webhook_url;
        }

        public String getKeywords() {
            return keywords;
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public int getMinPrice() {
            return min_price;
        }

        public int getMaxPrice() {
            return max_price;
        }

        public long getDelay() {
            return delay;
        }
    }
}