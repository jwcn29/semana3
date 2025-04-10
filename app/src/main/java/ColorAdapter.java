import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.colorlistapp.R;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ViewHolder> {

    private List<ColorItem> colorList;
    private Context context;

    public ColorAdapter(Context context, List<ColorItem> colorList) {
        this.context = context;
        this.colorList = colorList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View colorCircle;
        public TextView colorName, colorHex;

        public ViewHolder(View view) {
            super(view);
            colorCircle = view.findViewById(R.id.color_circle);
            colorName = view.findViewById(R.id.color_name);
            colorHex = view.findViewById(R.id.color_hex);
        }
    }

    @Override
    public ColorAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.color_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ColorAdapter.ViewHolder holder, int position) {
        ColorItem item = colorList.get(position);
        holder.colorName.setText(item.getColorName());
        holder.colorHex.setText(item.getColorHex());

        GradientDrawable bgShape = (GradientDrawable) holder.colorCircle.getBackground();
        bgShape.setColor(item.getColorResId());
    }

    @Override
    public int getItemCount() {
        return colorList.size();
    }
}
