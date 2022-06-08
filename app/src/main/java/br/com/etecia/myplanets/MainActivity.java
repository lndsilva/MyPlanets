package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarar a lista
    ListView listaPlanetas;

    //Criando os vetores com os dados para lista
    String nomePlanetas[] = {"Jupiter", "Lua", "Marte", "Mercurio",
            "Netuno", "Plutão", "Saturno", "Sol", "Terra", "Urano", "Venus"};

    int imagemPlanetas[] = {R.drawable.jupiter, R.drawable.lua,
            R.drawable.marte, R.drawable.mercurio, R.drawable.netuno,
            R.drawable.plutao, R.drawable.saturno, R.drawable.sol,
            R.drawable.terra, R.drawable.urano, R.drawable.venus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPlanetas = findViewById(R.id.idListaPlanetas);

        MyAdapter adapter = new MyAdapter();

        listaPlanetas.setAdapter(adapter);

        listaPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), MostraPlanetaActivity.class);
                //implementando o putExtra
                intent.putExtra("nomePLaneta", nomePlanetas[i]);
                intent.putExtra("imagemPLaneta", imagemPlanetas[i]);

                startActivity(intent);
            }
        });
    }

    //criando a classe interna - inner class
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemPlanetas.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Declarar os componentes do modelo que serão utilizados na lista
            ImageView imgPlanetas;
            TextView txtPlanetas;

            View view1 = getLayoutInflater().inflate(R.layout.modelo_planetas, null);

            txtPlanetas = view1.findViewById(R.id.txtModeloPlaneta);
            imgPlanetas = view1.findViewById(R.id.imgModeloPlaneta);

            //Implementar os metodos nos componentes
            txtPlanetas.setText(nomePlanetas[i]);
            imgPlanetas.setImageResource(imagemPlanetas[i]);

            return view1;
        }
    }

}