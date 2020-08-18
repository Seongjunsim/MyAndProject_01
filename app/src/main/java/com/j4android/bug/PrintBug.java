package com.j4android.bug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrintBug extends AppCompatActivity {
    ArrayList<CharList> myList = new ArrayList<CharList>();
    ListView list;
    int P;

    @Override
    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.print_bug);
        Intent intent = new Intent(getIntent());
        String player = intent.getStringExtra("player");
        P = Integer.parseInt(player);
        list = (ListView)findViewById(R.id.list_view);
        try {
            myList = readData();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        ArrayAdapter<CharList> adapter = new CharAdapter(this,myList);
        list.setAdapter(adapter);

    }

    public ArrayList<CharList> readData() throws NoSuchFieldException, IllegalAccessException {
        ArrayList<CharList> lists = new ArrayList<CharList>();
        lists.clear();

        for(int i=1; i<=P; i++){
            Random r = new Random();
            int num = r.nextInt(46)+1;
            String resName = "@drawable/img"+num;
            int resID = getResources().getIdentifier(resName,"drawable",this.getPackageName());
            lists.add(new CharList(String.valueOf(i),getName(num),resID));
        }
        return lists;
    }
    public String getName(int num){
        switch(num){
            case 1:
                return "루피";
            case 2:
                return "조로";
            case 3:
                return "나미";
            case 4:
                return "우솝";
            case 5:
                return "상디";
            case 6:
                return "쵸파";
            case 7:
                return "로빈";
            case 8:
                return "프랑키";
            case 9:
                return "브룩";
            case 10:
                return "시라호시";
            case 11:
                return "아카이누";
            case 12:
                return "아오키지";
            case 13:
                return "키자루";
            case 14:
                return "검은수염";
            case 15:
                return "샹크스";
            case 16:
                return "로우";
            case 17:
                return "도플라밍고";
            case 18:
                return "사보";
            case 19:
                return "후지토라";
            case 20:
                return "타시기";
            case 21:
                return "루치";
            case 22:
                return "호킨스";
            case 23:
                return "징베";
            case 24:
                return "로져";
            case 25:
                return "레일리";
            case 26:
                return "가반";
            case 27:
                return "거프";
            case 28:
                return "흰수염";
            case 29:
                return "센고쿠";
            case 30:
                return "시키";
            case 31:
                return "드래곤";
            case 32:
                return "제트";
            case 33:
                return "카이도";
            case 34:
                return "빅맘";
            case 35:
                return "에이스";
            case 36:
                return "버기";
            case 37:
                return "핸콕";
            case 38:
                return "카벤딧슈";
            case 39:
                return "비비";
            case 40:
                return "미호크";
            case 41:
                return "레드필드";
            case 42:
                return "레베카";
            case 43:
                return "아인";
            case 44:
                return "에넬";
            case 45:
                return "카타쿠리";
            case 46:
                return "크로커다일";
            case 47:
                return "시노부";



            default:
                return "Undefined";

        }
    }
}
