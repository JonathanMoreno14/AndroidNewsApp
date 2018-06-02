# Android News API

* Android application that uses the News API to display current news

* The application displays news from [Business Insider](http://www.businessinsider.com/)

![webp net-gifmaker 4](https://user-images.githubusercontent.com/11635523/40864777-dd44bc12-65ba-11e8-952e-c6617f955329.gif)


## [Powered by News API](https://newsapi.org)


#### Permissions

```xml

<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

```

#### Dependency
```xml

implementation 'com.squareup.picasso:picasso:2.71828'

```


**app/java/MainActivity**

```java

String API_KEY = "API Key"; //your API key from News API
String SELECTED_NEWS = "business-insider"; //you can choose from various news outlets available from News API4

```

## How to sign up for a free non-commerical use of the  News API

Go to the NewApi website and  click on **Get API key**

![screen shot 2018-05-31 at 10 50 17 am](https://user-images.githubusercontent.com/11635523/40812924-feb27794-64fd-11e8-9aba-1b4ef9a22101.png)

Here you will register for an account

![screen shot 2018-05-31 at 10 50 30 am](https://user-images.githubusercontent.com/11635523/40812923-fe9d38c0-64fd-11e8-8add-4572873eddfc.png)

You will need to add a attribution link, which is required for free non-commercial use

![screen shot 2018-05-31 at 10 51 35 am](https://user-images.githubusercontent.com/11635523/40812922-fe7f8758-64fd-11e8-9228-15b1ff7c9ba5.png)


## References

[AndrosStock](https://www.androstock.com/tutorials/create-a-news-app-on-android-android-studio.html) Tutorial 

[WebView](https://developer.android.com/reference/android/webkit/WebView)

[AsyncTask](https://developer.android.com/reference/android/os/AsyncTask)

[JSONObject](https://developer.android.com/reference/org/json/JSONObject)

[JSONArray](https://developer.android.com/reference/org/json/JSONArray)

[HttpURLConnection](https://developer.android.com/reference/kotlin/java/net/HttpURLConnection)

