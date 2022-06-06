package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

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

    }

    //criando a classe interna - inner class
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
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
            return null;
        }
    }

}