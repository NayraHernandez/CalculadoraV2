package mxl.edu.itchetumal.dadm.calculadora;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Button btnUno, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0, btnC, btnMenos, btnMas, btnIgual;
    TextView editResultado;
    double numero1, numero2, resultado;
    String operador;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC = (Button)findViewById(R.id.btnC);
        btnIgual = (Button)findViewById(R.id.btnIgual);
        btnMas = (Button)findViewById(R.id.btnMas);
        btnMenos = (Button)findViewById(R.id.btnMenos);
        btn0 = (Button)findViewById(R.id.btn0);
        btnUno = (Button)findViewById(R.id.btnUno);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        //Botones del 0-9
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("0");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                {
                    editResultado.setText("0");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"0");
                }
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("1");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                {
                    editResultado.setText("1");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("2");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                {
                    editResultado.setText("2");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("3");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                { 
                    editResultado.setText("3");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("4");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                {
                    editResultado.setText("4");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("5");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                {
                    editResultado.setText("5");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("6");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                {
                    editResultado.setText("6");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("7");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                {
                    editResultado.setText("7");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("8");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                {
                    editResultado.setText("8");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                if(editResultado.getText().equals("0"))
                {
                    editResultado.setText("9");
                }
                else if (editResultado.getText().equals(String.valueOf(resultado)))
                {
                    editResultado.setText("9");
                    resultado = 0;
                }
                else {
                    editResultado.setText(editResultado.getText()+"9");
                }
            }
        });
        //Operaciones
        //Suma
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador= "+";
                onClickOperacionCapturaNumero1(v);
            }
        });
        //Resta
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador= "-";
                onClickOperacionCapturaNumero1(v);
            }
        });
        //Borrar resultado
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResultado=(TextView)findViewById(R.id.editResultado);
                editResultado.setText("0");
                resultado=0;
            }
        });

        //Mostrar resultado de la operacion
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toma lo que esta en la pantalla
                editResultado=(TextView)findViewById(R.id.editResultado);
                //Almacena los nuemeros en la variable numero2
                numero2=Double.parseDouble(editResultado.getText().toString());
                if(editResultado.getText().toString().length()==0){
                    editResultado.setText("0");
                }
                else if(operador.equals("+"))
                {
                    resultado= numero1+numero2;
                }
                else if(operador.equals("-"))
                {
                    resultado= numero1-numero2;
                }
                editResultado.setText(String.valueOf(resultado));
                numero1=0;
                numero2=0;
            }
        });
    }
    //Capturar los valores en una variable
    public void onClickOperacionCapturaNumero1(View view) {

        //Toma lo que esta en la pantalla
        editResultado=(TextView)findViewById(R.id.editResultado);
        //Almacena los nuemeros en la variable numero1
        numero1=Double.parseDouble(editResultado.getText().toString());
        //Deja la pantalla en 0
        editResultado.setText("0");
    }
}

