package shevelyova.project;

import android.app.Activity;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    static String up(String word,String let,String w){
        boolean getlife=true;
        char[]wArr=w.toCharArray();
        char[]letArr=let.toCharArray();
        char[] wordArr=word.toCharArray();
        int h=0;
        for(int i=0;i<wordArr.length;i++){
            if(letArr[0]==wordArr[i]){
                wArr[h]=letArr[0];
                getlife=false;
            }
            h+=2;
        }

        w = "";
        for (int t=0;t<wArr.length;t++){
            w += Character.toString(wArr[t]);
        }
        if (getlife)
            lives-=1;
        return w;
    }

    public static boolean test(String w){
        boolean test = true;
        for (int i=0;i<w.length();i++){
            if (w.contains("_"))
                test=false;

        }
        return test;
    }






    Button a, b, v, g, d, ye, yo, j, z, i, y, k, l, m, n, o, p, r, s, t, u, f, h, c, ch, sh, shc, tz, yy, mz, e, yu, ya;
    Button pressed;
    TextView ida,idb;
    static ArrayList words;
    static String word,w;
    static int lives;
    static String let;
    static boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ida = (TextView) findViewById(R.id.ida);
        idb = (TextView) findViewById(R.id.idb);
        words=new ArrayList<String>();
        lives=10;
        flag=false;
        w="";
        ida.setText(w);
        idb.setText("Осталось " + lives + " попыток. УГАДАЙ БУКВУ");

        try{
            File hangman=new File("hangman.txt");
            BufferedReader br = new BufferedReader(new FileReader(String.valueOf(getResources().openRawResource(R.raw.hangman))));
            String str;
            while((str=br.readLine()) != null) {
                words.add(str);
            }
            int ran=(int)(Math.random()*words.size());
            word=words.get(ran).toString();
           // word="масленица";
            for (int i=1;i<=word.length();i++){
                w+="_ ";
            }
            ida.setText(w);
            idb.setText("Осталось " + lives + " попыток. УГАДАЙ БУКВУ");

        }catch(IOException e){
            idb.setText("Не удалось найти файл");
        }



        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        v = (Button) findViewById(R.id.v);
        g = (Button) findViewById(R.id.g);
        d = (Button) findViewById(R.id.d);
        ye = (Button) findViewById(R.id.ye);
        yo = (Button) findViewById(R.id.yo);
        j = (Button) findViewById(R.id.j);
        z = (Button) findViewById(R.id.z);
        i = (Button) findViewById(R.id.i);
        y = (Button) findViewById(R.id.y);
        k = (Button) findViewById(R.id.k);
        l = (Button) findViewById(R.id.l);
        m = (Button) findViewById(R.id.m);
        n = (Button) findViewById(R.id.n);
        o = (Button) findViewById(R.id.o);
        p = (Button) findViewById(R.id.p);
        r = (Button) findViewById(R.id.r);
        s = (Button) findViewById(R.id.s);
        t = (Button) findViewById(R.id.t);
        u = (Button) findViewById(R.id.u);
        f = (Button) findViewById(R.id.f);
        h = (Button) findViewById(R.id.h);
        c = (Button) findViewById(R.id.c);
        ch = (Button) findViewById(R.id.ch);
        sh = (Button) findViewById(R.id.sh);
        shc = (Button) findViewById(R.id.shc);
        tz = (Button) findViewById(R.id.tz);
        yy = (Button) findViewById(R.id.yy);
        mz = (Button) findViewById(R.id.mz);
        e = (Button) findViewById(R.id.e);
        yu = (Button) findViewById(R.id.yu);
        ya = (Button) findViewById(R.id.ya);


        a.setOnClickListener(this);
        b.setOnClickListener(this);
        v.setOnClickListener(this);
        g.setOnClickListener(this);
        d.setOnClickListener(this);
        ye.setOnClickListener(this);
        yo.setOnClickListener(this);
        j.setOnClickListener(this);
        z.setOnClickListener(this);
        i.setOnClickListener(this);
        y.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        f.setOnClickListener(this);
        h.setOnClickListener(this);
        c.setOnClickListener(this);
        ch.setOnClickListener(this);
        sh.setOnClickListener(this);
        shc.setOnClickListener(this);
        tz.setOnClickListener(this);
        yy.setOnClickListener(this);
        mz.setOnClickListener(this);
        e.setOnClickListener(this);
        yu.setOnClickListener(this);
        ya.setOnClickListener(this);

    }


    @Override
    public void onClick(View x) {
        switch (x.getId()) {
            case R.id.a:
                pressed = a;
                break;
            case R.id.b:
                pressed = b;
                break;
            case R.id.v:
                pressed = v;
                break;
            case R.id.g:
                pressed = g;
                break;
            case R.id.d:
                pressed = d;
                break;
            case R.id.ye:
                pressed = ye;
                break;
            case R.id.yo:
                pressed = yo;
                break;
            case R.id.j:
                pressed = j;
                break;
            case R.id.z:
                pressed = z;
                break;
            case R.id.i:
                pressed = i;
                break;
            case R.id.y:
                pressed = y;
                break;
            case R.id.k:
                pressed = k;
                break;
            case R.id.l:
                pressed = l;
                break;
            case R.id.m:
                pressed = m;
                break;
            case R.id.n:
                pressed = n;
                break;
            case R.id.o:
                pressed = o;
                break;
            case R.id.p:
                pressed = p;
                break;
            case R.id.r:
                pressed = r;
                break;
            case R.id.s:
                pressed = s;
                break;
            case R.id.t:
                pressed = t;
                break;
            case R.id.u:
                pressed = u;
                break;
            case R.id.f:
                pressed = f;
                break;
            case R.id.h:
                pressed = h;
                break;
            case R.id.c:
                pressed = c;
                break;
            case R.id.ch:
                pressed = ch;
                break;
            case R.id.sh:
                pressed = sh;
                break;
            case R.id.shc:
                pressed = shc;
                break;
            case R.id.tz:
                pressed = tz;
                break;
            case R.id.yy:
                pressed = yy;
                break;
            case R.id.mz:
                pressed = mz;
                break;
            case R.id.e:
                pressed = e;
                break;
            case R.id.yu:
                pressed = yu;
                break;
            case R.id.ya:
                pressed = ya;
                break;
        }
        let = pressed.getText().toString();

        //let=read.nextLine();
        w = up(word, let, w);
        ida.setText(w);
        idb.setText("Осталось " + lives + " попыток. УГАДАЙ БУКВУ");
        flag = test(w);
         if ((flag)||(lives==0)){

            if (flag)
                idb.setText(word+" ТЫ ВЫИГРАЛ");
            else
                idb.setText(word+" ТЫ ПРОИГРАЛ");

        }

    }

}
