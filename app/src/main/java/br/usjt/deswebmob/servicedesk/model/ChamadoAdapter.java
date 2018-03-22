package br.usjt.deswebmob.servicedesk.model;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.usjt.deswebmob.servicedesk.R;

/**
 * Created by Daniel André dos Santos - RA: 816125541
 */

public class ChamadoAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<Chamado> chamados;

    public ChamadoAdapter(Context context, ArrayList<Chamado> chamados) {
        this.context = context;
        this.chamados = chamados;
    }

    @Override
    public int getCount() {
        return chamados.size();
    }

    @Override
    public Object getItem(int i) {
        return chamados.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int i, View contextView, ViewGroup viewGroup) {
        View view = contextView;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.linha_chamado, viewGroup, false);

            ImageView imagem = (ImageView) view.findViewById(R.id.imagem_fila);
            TextView numero = (TextView) view.findViewById(R.id.numero_status_chamado);
            TextView datas = (TextView) view.findViewById(R.id.abertura_fechamento_chamado);
            TextView descricao = (TextView) view.findViewById(R.id.descricao_chamado);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.setNumero(numero);
            viewHolder.setDatas(datas);
            viewHolder.setDescricao(descricao);
            viewHolder.setImagem(imagem);
            view.setTag(viewHolder);
        }
        Chamado chamado = chamados.get(i);

        ViewHolder viewHolder = (ViewHolder) view.getTag();
        viewHolder.getImagem().setImageDrawable(Util.getDrawableDinamic(context, chamado.getFila().getFigura()));

        viewHolder.getNumero().setText(String.format("numero: %d - status: %s", chamado.getNumero(), chamado.getStatus()));
        viewHolder.getDatas().setText(String.format("abertura: %tD - fechamento: %tD", chamado.getDataAbertura(), chamado.getDataFechamento()));
        viewHolder.getDescricao().setText(chamado.getDescricao());

        return view;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
