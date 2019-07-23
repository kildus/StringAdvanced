package com.demo.stringadvanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String nameString = "name1, name2, name3, name4";
//        String[] names = nameString.split(", ");
//        for (String name:names) {
//            Log.i("MyName", name);
//        }

//        String str = "Geometry";
//        String sub = str.substring(1, 8);
//        Log.i("test", sub);
//    }

//        String river = "MississippiMississippi";
//        Pattern pattern = Pattern.compile("Mi(.*?)pi");
//        Matcher matcher = pattern.matcher(river);
//        while (matcher.find()){
//            Log.i("test", matcher.group(1));
//        }

        String url = "<div class=\"image\">\n" +
                "\t\t\t\t\t\t<img src=\"http://cdn.posh24.se/images/:profile/0b17fa7e4e9dbbed7430a38e4750fd21d\" alt=\"Beyonce\"/>\n" +
                "\t\t\t\t\t</div>";

        Pattern pattern = Pattern.compile("<img src=\"(.*?)\" alt");
        Matcher matcher = pattern.matcher(url);
        while (matcher.find()) {
            Log.i("test", matcher.group(1));
        }

        pattern = Pattern.compile("alt=\"(.*?)\"/>");
        matcher = pattern.matcher(url);
        while (matcher.find()) {
            Log.i("test", matcher.group(1));
        }

    }
}
