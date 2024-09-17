package br.ulbra.appcalculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtValorA, edtValorB;
    Button btnSomar, btnSub, btnMul, btnDiv;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Vincular os componentesd de interfac3e com o codigo java
        edtValorA = findViewById(R.id.edtValorA);
        edtValorB = findViewById(R.id.edtValorB);
        btnSomar = findViewById(R.id.btnSomar);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtResultado = findViewById(R.id.txtResultado);
        //Definir o evento de clique do botão
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, resultado;
                try {
                    v1 = Double.parseDouble(edtValorA.getText().toString());
                    v2 = Double.parseDouble(edtValorB.getText().toString());
                    resultado = v1 + v2;
                    txtResultado.setText("Resultado é " + resultado);
                } catch (NumberFormatException e) {
                    //Trata o erro caso algum campo esteja vazio ou tenha um valor inválido
                    Toast.makeText(view.getContext(), "Por favor, preencha ambos os campos com númros válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, resultado;
                try {
                    v1 = Double.parseDouble(edtValorA.getText().toString());
                    v2 = Double.parseDouble(edtValorB.getText().toString());
                    resultado = v1 - v2;
                    txtResultado.setText("Resultado é " + resultado);
                } catch (NumberFormatException e) {
                    //Trata o erro caso algum campo esteja vazio ou tenha um valor inválido
                    Toast.makeText(view.getContext(), "Por favor, preencha ambos os campos com númros válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, resultado;
                try {
                    v1 = Double.parseDouble(edtValorA.getText().toString());
                    v2 = Double.parseDouble(edtValorB.getText().toString());
                    resultado = v1 * v2;
                    txtResultado.setText("Resultado é " + resultado);
                } catch (NumberFormatException e) {
                    //Trata o erro caso algum campo esteja vazio ou tenha um valor inválido
                    Toast.makeText(view.getContext(), "Por favor, preencha ambos os campos com númros válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, resultado;
                try {
                    v1 = Double.parseDouble(edtValorA.getText().toString());
                    v2 = Double.parseDouble(edtValorB.getText().toString());
                    resultado = v1 / v2;
                    txtResultado.setText("Resultado é " + resultado);
                } catch (NumberFormatException e) {
                    //Trata o erro caso algum campo esteja vazio ou tenha um valor inválido
                    Toast.makeText(view.getContext(), "Por favor, preencha ambos os campos com númros válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    ;
}