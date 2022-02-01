#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME}; #end


import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;




import java.util.ArrayList;
import java.util.List;

public class ${MODEL_NAME}Adapter extends RecyclerView.Adapter<${MODEL_NAME}Adapter.${MODEL_NAME}ViewHolder>{
        private ArrayList<${MODEL_NAME}> data ;
        private Context context;
        private ${MODEL_NAME}Listener modelListener;

public ${MODEL_NAME}Adapter (ArrayList<${MODEL_NAME}> data,Context context,${MODEL_NAME}Listener modelListener) {
        this.context = context;
        this.data = data;
        this.modelListener = modelListener;
        }

@NonNull
@Override
public ${MODEL_NAME}ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemContainer${MODEL_NAME}Binding binding = ItemContainer${MODEL_NAME}Binding.inflate(
            LayoutInflater.from(parent.getContext()),
            parent,
            false);
            
           
            return new ${MODEL_NAME}ViewHolder(binding);

        }

@Override
public void onBindViewHolder(@NonNull ${MODEL_NAME}ViewHolder holder, int position) {
        ${MODEL_NAME} model = data.get(position);

        holder.set${MODEL_NAME}Data(data.get(position),position);
        }

@Override
public int getItemCount() {
        return data.size();
        }

class ${MODEL_NAME}ViewHolder extends RecyclerView.ViewHolder {
    ItemContainer${MODEL_NAME}Binding binding;



public ${MODEL_NAME}ViewHolder(@NonNull  ItemContainer${MODEL_NAME}Binding itemContainer${MODEL_NAME}Binding) {
        super(itemContainer${MODEL_NAME}Binding.getRoot());
        binding = itemContainer${MODEL_NAME}Binding;


        }
        public void set${MODEL_NAME}Data (${MODEL_NAME} model,int position) {

        }
        }
        }
