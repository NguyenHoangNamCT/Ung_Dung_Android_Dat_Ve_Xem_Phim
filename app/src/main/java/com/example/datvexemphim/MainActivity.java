package com.example.datvexemphim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtTen, txtTheLoai, txtThoiGian;
    ListView lvPhim;
    ArrayList<Phim> phimArrayList;
    phim_adapter phimAdapter;
    Button btnThem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();

        phimAdapter = new phim_adapter(this, R.layout.dong_phim, phimArrayList);
        lvPhim.setAdapter(phimAdapter);

        lvPhim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, chi_tiet_phim.class);
                intent.putExtra("phimDuocChon", phimArrayList.get(i));
                startActivity(intent);
            }
        });

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = "Tên phim: ", tl = "Thể loại: ", kc = "Khởi chiếu: ", d = "Độ dài: ", dd = "Đạo diễn: ", dv = "Diễn viên chính: ";
                phimArrayList.add(new Phim(t+txtTen.getText().toString(), tl+txtTheLoai.getText().toString(), R.drawable.phim3,kc + "18/02/2001", d + txtThoiGian.getText().toString(), dd + "Toei", dv + "Noboru Kaneko, Kei Horie, Tetsuji Tamayama, Kazuyoshi Sakai, Takeru Shibaki, Mio Takeuchi", " 1000 năm trước, 1 cuộc chiến tàn khốc giữa con người và nòi giống ác quỷ Org đã nổ ra. Với sự giúp đỡ của GaoGod, Gao Pháp sư Murasaki và các Siêu Thú, các chiến binh Gao cổ xưa đã từng bước đánh bại Org. Nhưng các Highness Duke Org (ハイネスデュークオルグ Hainesu Dūku Orugu?) đã kết hợp lại với nhau và tạo thành Hyakkimaru (Bách Quỷ Hoàn) - vị vua Org với sức mạnh hủy diệt đã đánh bại GaoGod. Trước tình cảnh đó, một chiến binh Gao là Shirogane (GaoSilver) đã đeo Mặt nạ Sói đen để đưa sức mạnh ác quỷ vào cơ thể và 3 Siêu Thú của anh (GaoWolf, GaoLigator và GaoHammerhead) thông qua các Bảo thạch Gao, hòng đánh bại Hyakkimaru. Với sức mạnh của ác quỷ, anh đã đánh bại Hyakkimaru. Nhưng thể xác và tâm trí của anh đã bị tà khí từ chiếc mặt nạ thao túng và biến anh thành Rouki và ba Siêu Thú của anh trở thành các Ma Thú. Anh đã cầu xin các đồng đội phong ấn mình lại. Thế giới từ đó yên bình trở lại. 1000 năm sau, Org lại trỗi dậy, 5 chiến binh được lựa chọn bởi các Siêu Thú đã phải từ bỏ cuộc sống hiện tại để chống lại chúng dưới cái tên Chiến đội bách thú Gaoranger."));
                phimAdapter.notifyDataSetChanged();
            }
        });

        lvPhim.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                for(int j = 0; j < phimArrayList.size(); j++)
                    if(j == i)
                        phimArrayList.remove(j);
                phimAdapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Xoá thành công", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    public void anhXa(){
        btnThem = findViewById(R.id.btnThem);
        txtTen = findViewById(R.id.txtTenPhim);
        txtTheLoai = findViewById(R.id.txtTheLoai);
        txtThoiGian = findViewById(R.id.txtThoiGian);

        lvPhim = (ListView) findViewById(R.id.lsvPhim);
        phimArrayList = new ArrayList<>();
        String t = "Tên phim: ", tl = "Thể loại: ", kc = "Khởi chiếu: ", d = "Độ dài: ", dd = "Đạo diễn: ", dv = "Diễn viên chính: ";
        phimArrayList.add(new Phim(t+"5 Anh Em Siêu Nhân", tl+"Trẻ Em", R.drawable.phim1,kc + "18/02/2001", d + "480 phút", dd + "Toei", dv + "Noboru Kaneko, Kei Horie, Tetsuji Tamayama, Kazuyoshi Sakai, Takeru Shibaki, Mio Takeuchi", " 1000 năm trước, 1 cuộc chiến tàn khốc giữa con người và nòi giống ác quỷ Org đã nổ ra. Với sự giúp đỡ của GaoGod, Gao Pháp sư Murasaki và các Siêu Thú, các chiến binh Gao cổ xưa đã từng bước đánh bại Org. Nhưng các Highness Duke Org (ハイネスデュークオルグ Hainesu Dūku Orugu?) đã kết hợp lại với nhau và tạo thành Hyakkimaru (Bách Quỷ Hoàn) - vị vua Org với sức mạnh hủy diệt đã đánh bại GaoGod. Trước tình cảnh đó, một chiến binh Gao là Shirogane (GaoSilver) đã đeo Mặt nạ Sói đen để đưa sức mạnh ác quỷ vào cơ thể và 3 Siêu Thú của anh (GaoWolf, GaoLigator và GaoHammerhead) thông qua các Bảo thạch Gao, hòng đánh bại Hyakkimaru. Với sức mạnh của ác quỷ, anh đã đánh bại Hyakkimaru. Nhưng thể xác và tâm trí của anh đã bị tà khí từ chiếc mặt nạ thao túng và biến anh thành Rouki và ba Siêu Thú của anh trở thành các Ma Thú. Anh đã cầu xin các đồng đội phong ấn mình lại. Thế giới từ đó yên bình trở lại. 1000 năm sau, Org lại trỗi dậy, 5 chiến binh được lựa chọn bởi các Siêu Thú đã phải từ bỏ cuộc sống hiện tại để chống lại chúng dưới cái tên Chiến đội bách thú Gaoranger."));
        phimArrayList.add(new Phim(t+"BlackAdam", tl+"Viễn Tưởng", R.drawable.phim2,kc + "11/07/2022", d + "175 phút", dd + " Lawrence Sher", dv +  "Dwayne Johnson, Henry Cavill, Jennifer Holland", "Black Adam là một bộ phim điện ảnh siêu anh hùng của Hoa Kỳ ra mắt năm 2022, dựa trên nhân vật cùng tên của DC Comics. Được sản xuất bởi New Line Cinema, DC Films, Seven Bucks Productions và Flynn Picture, đây là phần phim ngoại truyện của Shazam!, và là phim thứ 11 trong Vũ trụ Mở rộng DC."));
        phimArrayList.add(new Phim(t+"Bát Trận Đồ", tl+"Võ Thuật", R.drawable.phim3,kc + "23/06/2006", d + "90 phút", dd + "Lý Văn Long", dv + "Châu Hải My, Thái Thiếu Phân, Trần Pháp Dung, Vu Ba", "Phim Bát trận đồ lấy bối cảnh vào năm 200 sau Công nguyên, ba nước Ngụy - Thục - Ngô phân chia thiên hạ. Bát trận đồ là quyển binh pháp đúc kết những kinh nghiệm chinh chiến của Khổng Minh - Gia Cát Lượng. Theo lời Võ hậu tiên đoán, 600 năm sau, quyển binh pháp này sẽ tái xuất hiện và làm dấy lên một trận phong ba, người có được Bát trận đồ sẽ trở thành bá chủ võ lâm. Gia Cát Khổng Minh bỗng nhiên từ trần không biết nguyên do nhưng hậu nhân vẫn tin tưởng vào trận pháp binh thư mà ông đã dùng hết tinh lực của mình để hoàn thành. Sự tái xuất giang hồ của Bát trận đồ sau 600 năm là sự khởi đầu cho những âm mưu xưng bá, những câu chuyện ly kỳ cùng những mối tình dang dở."));
        phimArrayList.add(new Phim(t+"Cậu Bé Ma", tl+"Kinh Di", R.drawable.phim4,kc + "18/03/2020", d + "86 phút", dd + "William Brent Bell", dv +"Christopher Convery, Katie Holmes, Owain Yeoman", "Một gia đình chuyển đến nhà mới. Mọi thứ có vẻ như rất ổn cho đến khi cậu con trai của họ tìm thấy một mô hình búp bê được chôn dưới đất. Cũng từ đây, nhiều chuyện kì lạ đã xảy ra, con búp bê dường như đã bị nguyền rủa và đang gieo rắc nỗi ám ảnh kinh hoàng cho tất cả mọi người." ));
        phimArrayList.add(new Phim(t+"Tân Tây Du Ký", tl+"Thần Thoại", R.drawable.phim5,kc + "27/05/2011", d + "100 phút", dd + "Trương Kỷ Trung", dv +"Ngô Việt, Nhiếp Viễn, Tang Kim Sinh, Từ Cẩm Giang, Vương Cửu Thắng", "Bối cảnh của Tân Tây Du Ký là ở vùng tự trị Tây Tạng. Đây là một nơi sơn thủy hữu tình với những cánh rừng hoang dã, núi đồi san sát với mặt nước rất đẹp. Những phân cảnh được thực hiện khá nhanh, chỉ mất khoảng hơn 1 tiếng cho mỗi cảnh quay mà thôi. Bộ phim mới về câu chuyện thầy trò Đường Tăng đi lấy kinh do đài truyền hình Triết Giang thực hiện quy tụ rất nhiều mỹ nhân trẻ trung, duyên dáng tham gia. Hầu hết người đẹp vào vai… yêu quái. Nữ diễn viên Hàn Tuyết (Han Xue) đóng Bạch Cốt Tinh. Cô có hình thể duyên dáng, thể hiện sự mê hoặc quyến rũ qua ánh mắt hút hồn và nụ cười mỉm đầy ma thuật. Trần Đức Dong (Chen Derong) đóng công chúa của Thiên Trúc và cũng là yêu quái thỏ ngọc hóa thành. Cô có khuôn mặt được cho là rất hoàn hảo khi vào vai cô công chúa giả, kết hợp với diễn xuất tài tình. Diễn viên Lưu Tư (Liu Zi) vào vai Thiết Phiến công chúa. Cô đã thể hiện được vẻ nham hiểm và lạnh lùng của vợ Ngưu Ma Vương. Vu Na (Yu Na) đóng Bạch Mao Tịnh Thử – yêu tinh chuột ma quái nhưng cũng rất khêu gợi. Vương Lực Khả (Wang Li Yi Yao) thủ vai Xà yêu nữ ranh ma. Phiên bản mới nhấn mạnh vào việc Bạch Cốt Tinh có mối hận tình với Tôn Ngộ Không nên mới độc ác như vậy. Trần Đức Dong (Chen Derong) đóng công chúa của Thiên Trúc. Diễn viên Lưu Tư đóng Thiết Phiến công chúa. Thiết Phiến công chúa là vợ của Ngưu Ma Vương. Cuộc giao tranh giữa cô và Tôn Ngộ Không khiến lửa Hỏa Diệm Sơn bốc lên mù mịt. Bạch Mao Tịnh Thử là yêu tinh chuột, tìm mọi cách quyến rũ Đường Tăng." ));
        phimArrayList.add(new Phim(t+"Lửa Tình", tl+"Tâm Lý", R.drawable.phim6,kc + "13/08/2018", d + "103 phút", dd + "Giản Học Bân", dv + "Phan Bách Hi, Trần Ấu Phương, Trần Văn Sơn, Vương Lạc Nghiên", "Bộ phim Lừa Tình – Love Scams xoay quanh sự nghiệp và scandal của nữ diễn viên hư hỏng Trương Vân. Cô bị giới truyền thông đeo bám và liên tục đã kích, do quá áp lực nên quyết định rút lui về nước. Cô bị tay săn ảnh Ah-K đeo bám, hắn là người đã lên kế hoạch gài bẫy cô với sự giúp đỡ của một người bạn là Hoàng Hạo. Ban đầu Hoàng Hạo không hứng thú với"));

    }
}