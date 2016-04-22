package br.unifor.pin.ssa.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import br.unifor.pin.ssa.R;
import br.unifor.pin.ssa.entity.Solicitacao;

/**
 * Classe de iniciacao da Activity de detalhe da solicitacao
 * Created by Daniel Jorge on 08/04/2016.
 */
public class SolicitacaoDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitacao_detail);

        /**
         * Recupera o objeto passado de outra activity/fragment para setar nas labels que compoem a activity
         */
        Solicitacao solicitacao = (Solicitacao) getIntent().getSerializableExtra("Solicitacao");

        TextView txtIdSolicitacao = (TextView) findViewById(R.id.txt_id_solicitacao);
        TextView txtStatusSolicitacao = (TextView) findViewById(R.id.txt_status_solicitacao_detail);
        TextView txtSolicitante = (TextView) findViewById(R.id.txt_solicitante_detail);
        TextView txtAssuntoSolicitacao = (TextView) findViewById(R.id.txt_assunto_solicitacao_detail);
        TextView txtDscSolicitacao = (TextView) findViewById(R.id.txt_dsc_solicitacao_detail);
        TextView labelRespostaSolicitacao = (TextView) findViewById(R.id.label_resposta_solicitacao_detail);
        TextView txtRespostaSolicitacao = (TextView ) findViewById(R.id.txt_resposta_solicitacao_detail);

        if (txtIdSolicitacao != null) {
            txtIdSolicitacao.setText(solicitacao.getId().toString());
        }
        if (txtStatusSolicitacao != null) {
            txtStatusSolicitacao.setText(solicitacao.getStatusSolicitacao().getDescricao().toUpperCase());
        }
        if (txtSolicitante != null) {
            txtSolicitante.setText(solicitacao.getUsuario().getNome());
        }
        if (txtAssuntoSolicitacao != null) {
            txtAssuntoSolicitacao.setText(solicitacao.getAssunto().toUpperCase());
        }
        if (txtDscSolicitacao != null) {
            txtDscSolicitacao.setText(solicitacao.getDescricao().toUpperCase());
        }
        if (labelRespostaSolicitacao != null) {
            labelRespostaSolicitacao.setVisibility(solicitacao.getRespostaSolicitacao() != null ? View.VISIBLE : View.GONE);
        }
        if (txtRespostaSolicitacao != null) {
            txtRespostaSolicitacao.setVisibility(solicitacao.getRespostaSolicitacao() != null ? View.VISIBLE : View.GONE);
            txtRespostaSolicitacao.setText(txtRespostaSolicitacao.getVisibility() == View.VISIBLE ? solicitacao.getRespostaSolicitacao().toUpperCase() : "");
        }



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_out, R.anim.left_in);
    }
}
