package com.wahyu.mkanankhaspalu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Toolbar toolbar;

    String[] mTitle = {"Duo Sale","Uta Kelo","Nasi Jagung","Palumara","Lalampa","Labia Dange","Onyop","Saraba","Kaledo","Kapurung"};
    String[] mDescription = {"Bagi Toppers pecinta sambal, tentu kamu harus mencicipi Duo sale, sambal khas dari kota Palu. Kuliner khas Palu satu ini terbuat dari ikan teri yang telah dikeringkan dan kemudian dimasak dengan bumbu cabai merah, bawang merah, dan juga tomat. Memiliki cita rasa manis tak terlalu pedas, makanan khas Kota Palu ini cocok disantap bersama nasi hangat ataupun nasi jagung, panganan khas kota Palu lainnya.",
            "Makanan khas Palu selanjutnya adalah uta kelo atau sayur daun kelor. Makanan satu ini tergolong unik karena daun kelor umumnya bukanlah bahan makanan yang umum di bagian Nusantara lainnya. Memiliki ciri khas berkuah, kuliner khas Sulawesi Tengah ini kerap membuat orang yang mencicipinya ketagihan.",
            "Telah disinggung di awal, makanan khas Palu selanjutnya adalah Nasi Jagung. Terbuat dari biji jagung yang sudah tua, kemudian ditumbuk kasar hingga menjadi sebesar biji beras, nasi jagung ini memiliki rasa pulen yang nggak kalah dengan nasi dari beras padi, lho! Cocok untuk disantap bersama Duo Sale dan Uta Kelo yang telah dibahas sebelumnya.",
            "Lauk khas Palu lainnya yang bisa melengkapi sajian nasi jagung adalah Palumara. Palumara sendiri merupakan sup ikan khas Palu yang memiliki rasa khas pedas dan asam. Dimasak dengan ikan laut khas di laut Sulawesi, kuliner Palu satu ini wajib dicicipi penggemar seafood.",
            "Lalampa adalag makanan ringan khas Palu yang sekilas terlihat seperti lemper. Namun, ang memedakan adalah isian dari makanan ini yaitu ikan cakalang. Dimasak dengan cara dibakar, makanan Palu satu ini memiliki aroma khas yang sangat sedap.",
            "Camilan khas Palu lainnya selain Lalampa adalah Labia dange atau sagu dange. Camilan Palu satu ini terbuat dari sagu yang dimasak menggunakan wajan dan tungku tanah liat. Biasa disantap dengan olahan gula merah atau dengan ikan, makanan ini memiliki cita rasa gurih dan renyah yang lezat.",
            "Sekilas, kuliner khas Palu, Sulawesi Tengah ini terlihat seperti Jenang, makanan khas Jawa Timur. Yang membedakannya adalah Onyop disajikan bersama kuah ikan yang memiliki rasa asam yang segar.",
            "Saraba adalah minuman khas Palu yang memiliki rasa menyerupai wedang jahe dan disajikan dalam keadaan hangat. Minuman ini sangat pas untuk disantap saat hari hujan ataupun malam hari saat udara dingin. Untuk Toppers yang menyukai rasa manis, Saraba juga sedap jika diberi tambahan susu kental manis.",
            "Kuliner khas Kota Palu selanjutnya sangat cocok untuk kamu penggemar daging sapi. Kaledo adalah sejenis sup kaki sapi yang diolah dengan bumbu-bumbu khas yang membuat kaldu dari Kaledo sangat gurih dan lezat.",
            "Kapurung adalah kuliner khas Palu yang juga terbuat dari sagu. Sagu yang telah masak kemudian disiram kuah kuning yang terbuat dari kaldu ikan, sayuran, irisan mangga, dan juga daging udang yang membuat panganan ini sangat gurih."};

    int[] images = {R.drawable.duosale, R.drawable.utakelo, R.drawable.nasijagung, R.drawable.palumara, R.drawable.lalampa, R.drawable.labiadange, R.drawable.onyop, R.drawable.saraba, R.drawable.kaledo, R.drawable.kapurung};

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.about:
                startActivity(new Intent(this, about.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                    // also put your position
                    intent.putExtra("position", "" + 0);
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                    // also put your position
                    intent.putExtra("position", "" + 1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                    // also put your position
                    intent.putExtra("position", "" + 2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                    // also put your position
                    intent.putExtra("position", "" + 3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                    // also put your position
                    intent.putExtra("position", "" + 4);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[5]);
                    intent.putExtra("description", mDescription[5]);
                    // also put your position
                    intent.putExtra("position", "" + 5);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[6]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[6]);
                    intent.putExtra("description", mDescription[6]);
                    // also put your position
                    intent.putExtra("position", "" + 6);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[7]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[7]);
                    intent.putExtra("description", mDescription[7]);
                    // also put your position
                    intent.putExtra("position", "" + 7);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[8]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[8]);
                    intent.putExtra("description", mDescription[8]);
                    // also put your position
                    intent.putExtra("position", "" + 8);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), DetailActifity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[9]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[9]);
                    intent.putExtra("description", mDescription[9]);
                    // also put your position
                    intent.putExtra("position", "" + 9);
                    startActivity(intent);
                }

            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String[] rTitle;
        String[] rDescription;
        int[] rImages;

        MyAdapter (Context c, String[] title, String[] description, int[] imgs) {
            super(c, R.layout.item_row_makanan, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.item_row_makanan, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }

}
