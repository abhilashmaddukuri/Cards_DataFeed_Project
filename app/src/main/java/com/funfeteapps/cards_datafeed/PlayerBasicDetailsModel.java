package com.funfeteapps.cards_datafeed;

public class PlayerBasicDetailsModel {
    private String creditsLeft;

    private Data[] data;

    private String cache3;

    private Provider provider;

    private String v;

    private String ttl;

    public String getCreditsLeft() {
        return creditsLeft;
    }

    public void setCreditsLeft(String creditsLeft) {
        this.creditsLeft = creditsLeft;
    }

    public Data[] getData() {
        return data;
    }


    public class Provider
    {
        private String source;

        private String pubDate;

        private String url;

        public String getSource ()
        {
            return source;
        }

        public void setSource (String source)
        {
            this.source = source;
        }

        public String getPubDate ()
        {
            return pubDate;
        }

        public void setPubDate (String pubDate)
        {
            this.pubDate = pubDate;
        }

        public String getUrl ()
        {
            return url;
        }

        public void setUrl (String url)
        {
            this.url = url;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [source = "+source+", pubDate = "+pubDate+", url = "+url+"]";
        }
    }


    public class Data
    {
        private String name;

        private String fullName;

        private String pid;

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getFullName ()
        {
            return fullName;
        }

        public void setFullName (String fullName)
        {
            this.fullName = fullName;
        }

        public String getPid ()
        {
            return pid;
        }

        public void setPid (String pid)
        {
            this.pid = pid;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [name = "+name+", fullName = "+fullName+", pid = "+pid+"]";
        }
    }
}

