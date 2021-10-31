package Thainam.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Cooking extends AppCompatActivity {
    private RecyclerView rcvCooking;
    private UserCookingAdapter mUserCookingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);
        rcvCooking = findViewById(R.id.rcv_cooking);
        mUserCookingAdapter = new UserCookingAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rcvCooking.setLayoutManager(gridLayoutManager);

        mUserCookingAdapter.setData(getListUserCooking());
        rcvCooking.setAdapter(mUserCookingAdapter);

    }

    private List<UserCooking> getListUserCooking() {
        List<UserCooking>list = new ArrayList<>();
        list.add(new UserCooking(R.drawable.pizza,"Pizza","Bước 1: Cho men nở, nước ấm và đường vào chung với nhau. Để khoảng 10 phút để men có thể hoạt động, nó sẽ sủi bọt nhỏ lên.\n" +
                "\n" +
                "Bước 2: Bột, muối trộn chung với nhau. Rót hỗn hợp men, dầu ăn vào âu bột, dùng thìa gỗ trộn bột lên cho đều. Đặt bột ra mặt phẳng sạch có rắc bột áo, nhào đều bằng tay tới khi bột mịn và không dính tay. Để bột vào âu sạch có quét dầu ăn, bọc kín bằng màng nilon, ủ tới khi bột nở gấp đôi ban đầu.\n" +
                "\n"+
                "Bước 3: Ớt chuông, nấm và xúc xích hun khói thái hạt lựu. Cho chút xíu dầu ăn vào chảo, đổ phần nguyên liệu trên vào xào sơ trong vài phút. Bật lò nướng ở 240 độ C trong 10 phút trước khi nướng.\n" +
                "\n" +
                "Bước 4: Lấy bột đã ủ ra, dùng cây cán bột mỏng khoảng 0,5 cm để làm đế bánh pizza. Có thể chia đôi bột để làm hai bánh nhỏ.\n" +
                "\n" +
                "Bước 5: Dùng cọ hoặc thìa để phết sốt cà chua lên đế bánh. Tiếp đó, rải ½ phô mai Mozzarella lên mặt bánh. Thêm ớt chuông, nấm và xúc xích lên.\n" +
                "\n" +
                "Bước 7: Rắc phần phô mai Mozzarella còn lại lên trên cùng, rồi đem nướng trong 10 phút.\n" +
                "\n" +
                "Bước 8: Bạn thấy phô mai tan chảy đều trên mặt bánh và viền bánh nâu vàng đẹp mắt là được. Lấy bánh ra, dùng dao cắt bánh thành từng miếng hình tam giác để thưởng thức, chấm với tương ớt, tương cà."));
        list.add(new UserCooking(R.drawable.spagetti,"Spagetti","Sơ chế nguyên liệu\n" +
                "Thịt bò rửa sạch, bằm nhỏ, cho vào chén ướp : ½ thìa cà phê bột nêm, 1 thìa cà phê đường, ½ thìa cà phê muối, một ít hạt tiêu và đảo đều.\n" +
                "\n" +
                "Cà chua rửa sạch, cắt đôi bỏ hạt và cho vào máy xay sinh tố xay nhuyễn.\n" +
                "\n" +
                "Hành tây lột vỏ, rửa sạch, băm nhỏ.\n" +
                "\n" +
                "Hành củ và tỏi bạn bóc vỏ, rửa sạch và băm nhỏ.\n" +
                "\n" +
                "Rau mùi bỏ rễ, rửa sạch.\n" +
                "\n" +"Luộc mì\n" +
                "Cho khoảng 2 lít nước vào nồi và nấu sôi, bạn thêm vào nồi nước 2 thìa dầu ăn và 1 chút muối để sợi mỳ chín sẽ đậm vị hơn và không bị dính vào nhau.\n" +
                "\n" +
                "Nước sôi bạn thả mỳ ý vào luộc (nhớ để tơi mỳ ra để khi chúng mềm và chìm trong nước không bị dính vào nhau). Sau khi mỳ đã hoàn toàn chìm trong nước, bạn luộc thêm khoảng 2 – 3 phút cho sợi mỳ chín mềm có thể dùng đũa ngắt thử là được, giai đoạn này bạn nhớ đảo sợi mỳ để chúng không dính vào nhau. Thời gian luộc mỳ sẽ khoảng 8 – 10 phút như hướng dẫn trên bao bì.\n"+
                "\n" + " Làm nước sốt\n" +
                "Bắc chảo lên bếp, cho 1 xíu dầu ăn cho nóng và cho hành củ, tỏi đã băm nhuyễn vào phi cho thơm.\n" +
                "\n" +
                "Cho hành tây vào đảo đều cho tới khi hành chín ngả màu hơi trong.\n" +
                "\n" +
                "Tiếp tục cho sốt cà chua vào cùng với 1 xíu muối (nếu thích bạn có thể thêm vào nước mắm nhưng sẽ làm cho thịt bò dai hơn), nấu cho hỗn hợp sốt hơi sền sệt thì cho thịt bò vào đảo đều cho thịt tơi ra. Nếu thấy hỗn hợp sốt bây giờ bị đặc lại thì bạn có thể thêm vào chút nước.\n" +
                "\n" +
                "Thịt bò chín và gia vị vừa ăn, rắc thêm 1 ít hạt tiêu và tắt bếp nhé.\n" +
                "\n" +
                "Chia mỳ ra 4 dĩa và đổ nước sốt lên, thêm một vài cọng rau mùi trang trí cho dĩa mỳ thêm hấp dẫn và ngon miệng. Vậy là đã có món mỳ ý sốt cà chua bò bằm ngon chuẩn vị cho bữa sáng cuối tuần của gia đình rồi các mẹ nhé.\n"+
                "\n"+" Thành phẩm\n" +
                "Món mỳ ý có thể chế biến cùng nhiều nguyên liệu khác nhau nhưng mỳ ý sốt cà chua bò bằm là đơn giản và dễ hợp khẩu vị của mọi người nhất, lại rất thích hợp cho các bé giúp ăn ngon miệng và cung cấp đủ dinh dưỡng."));
        list.add(new UserCooking(R.drawable.beefteak,"Beef steak","Bạn từng say đắm món bò bít tết mà ai đó đã chiêu đãi nhưng không biết phải làm như thế nào? Có rất nhiều cách để chế biến món bò bít tết ngon, hấp dẫn tùy vào khẩu vị của từng người. Nhưng với công thức nấu ăn đơn giản dưới đây, bạn sẽ dễ dàng tìm được lời giải cho mình.\n" +
                "\n" +
                "Nguyên liệu:\n" +
                "- 2 miếng Rib Eye dày từ 1.5 - 2 cm ( 2 miếng steak mỗi miếng 200gram ) Tham khảo: 6 phần thịt bò chuyên làm bò bít tết\n" +
                "  Tiêu đen, muối, dầu ăn, bơ, tỏi, lá lương thảo\n" +
                "  1 túi sốt Omaha Steak ( Sốt kem Phomai )\n" +
                "\n" +
                "-Khoai tây sợi dài\n" +
                "\n" +
                "-Dưa leo, xà lách, rau sống, cà chua, hành tây…\n" +
                "\n" +
                "-Chảo gang chuyên đổ bít tết\n" +
                "\n" +
                "Cách chế biến món steak\n" +
                "Sơ chế\n" +
                "\n" +
                "- Rib eye ( Thăn lưng bò Mỹ) : Đặt thái từng miếng steak dày vừa vặn khoảng 2 cm. Đợi thịt bò đông lạnh rã đông khoảng 30 phút trong ngăn mát tủ lạnh. Lấy giấy khô thấm khô nước trên miếng thịt. Ướp thịt với một chút muối, 1 thìa dầu ăn/ dầu  hào, 1 thìa nhỏ bột năng rồi trộn đều. Ướp khoảng 30 phút.\n" +
                "\n" +
                "- Khoai tây sợi dài ( khoai tây mua sẵn tại Gofood, không cần cho thêm bất cứ gia vị gì, chỉ cần bật nóng chảo dầu và chiên khoai tây chiên )\n" +
                "\n" +
                "- Dưa leo gọt vỏ, thái khoanh vừa ăn, xà lách rửa sạch, cắt khúc vừa ăn, trộn cùng với 1 chút đường và giấm tạo thành dưa góp chua ngọt.\n" +
                "\n" +
                "- Rau sống rửa sạch, ngâm nước muối nhạt.\n" +
                "\n" +
                "Chế biến:\n" +
                "\n" +
                "Lưu ý: chảo gang được thiết kế chuyên làm bít tết rất dày, độ nóng cao, giữu nhiệt lâu cho nên bạn đừng cho thịt bò vào chảo vào đun lâu quá, thịt sẽ ra hết nước béo. Cũng đường lo trứng vẫn sống bởi nhiệt độ của chảo vẫn đủ làm chin trứng khi bạn nhấc chảo ra ngoài.\n" +
                "\n" +
                "Cách làm bò bít tết như sau:\n"+
                "\n" + "Chuẩn bị thịt bò Mỹ : Lấy thịt ra khỏi tủ lạnh khoảng 30 phút đến 1 giờ trước khi nấu. Đặt chúng trên một tấm giấy lót bằng giấy và thấm khô với khăn giấy. Điều này sẽ giúp làm khô bề mặt thịt, tạo thành lớp vỏ tốt hơn cho miếng bò bít tết.\n"+
                "\n" + "Nêm gia vị : Rắc 1 chút muối trên bề mặt thịt\n" +
                "Đun nóng chảo và nấu nóng dầu ăn\n" +
                "Bắt đầu áp chảo : Cẩn thận cho miếng thịt vào chảo để ý vỏ ngoài không còn dính vào chảo nữa, khoảng 1 phút. Lật và nấu ở phía bên kia trong 1 phút. Tiếp tục nấu và lật cho tổng cộng 4 phút.\n" +
                "Cho hương thảo, tỏi : Cẩn thận thêm bơ, tỏi, và thảo mộc vào chảo. Lật lại nướng một lần nữa. Nghiêng chảo để bơ nghiêng ở một bên và sử dụng một thìa lớn để rưới bơ lên miếng thịt. Lật lại và lặp lại. Bắt đầu kiểm tra nhiệt độ bên trong của thịt nướng tại thời điểm nấu chín tổng cộng 6 phút tùy theo sở thích chín vừa, chín tái của bạn.\n" +
                "Nghỉ ngơi bò bít tết : Cho miếng bò bít tết còn nóng vào đĩa để nghỉ ngơi 5 phút. Trong khi phần bít tết nghỉ ngơi, chuẩn bị nước sốt rưới lên miếng thịt.\n" +
                "Thái thịt bò bít tết miếng vừa ăn.\n" +
                "Hâm nóng sốt Omaha Steak và rưới lên những lát bò bít tết.\n" +
                "Bít tết được ăn nóng kèm với rau sống và bánh mì.\n" +
                "Yêu cầu thành phẩm: Món bò bít tết ngon chuẩn vị là miếng thịt bò mềm tan trong miệng, mọng nước, ngọt, ngậy mà không sống, không quá chín, không bị dai, bị xác, ngấm đều gia vị, nước sốt đậm đà."));
        list.add(new UserCooking(R.drawable.banhmi,"Bánh mì","Bánh mì chả lụa siêu đơn giản\n" +
                "Nguyên liệu cần chuẩn bị\n" +
                "1 ổ bánh mì.\n" +
                "\n" +
                "3 lát chả lụa.\n" +
                "\n" +
                "1 ít bơ hoặc nước sốt mayonnaise.\n" +
                "\n" +
                "1 trái dưa leo.\n" +
                "\n" +
                "1 ít ngò và hành lá.\n" +
                "\n" +
                "1 ít muối tiêu.\n"+
                "\n" +
                "1 ít nước tương.\n"+
                "\n" +"Các bước thực hiện món bánh mì chả\n" +
                "Đầu tiên, các bạn lấy một bánh mì sau đó dùng dao rạch theo đường rãnh giữa của ổ bánh mì để chúng ta có thể nhét phần nhân vào, các bạn nên chọn mua loại bánh mì giòn\n" +
                " hoặc bánh mì vừa mới được nướng chín ở ngay tại các lò bánh mì sẽ thơm và ngon hơn. \n" +
                "Sau đó các bạn thái phần chả lụa theo chiều dài của từng miếng chả lụa, hoặc có thể thái nhỏ to tùy thuộc vào sở thích của các bạn rồi sau đó để phần chả lụa ra ngoài cái tô.\n" +
                "Hành và ngò các bạn đem đi làm sạch, bỏ đi những lá vàng, úa rồi sau đó rửa cho thật sạch cùng với nước sau đó các bạn để ra ngoài cái tô cùng với chả lụa, và dưa leo các bạn đem đi rửa cho thật sạch rồi sau đó các bạn thái thành\n" +
                " từng lát mỏng theo, thái theo chiều dài của trái dưa leo.\n" +
                "Bây giờ, bắt đầu đến giai đoạn nhét phần nhân vào bên trong ổ bánh mì, để các bạn có thể thưởng thức được đầy đủ trọn hương vị của phần bánh mì kẹp chả lụa thì bước nhét phần nhân vào bên trong ổ bánh mì là rất quan trọng. \n" +
                "Trước tiên, các bạn cần tách ổ bánh mì ra làm hai, sau đó, các bạn tiến hành trét phần bơ vào bên trong 2 mặt trong của ổ bánh mì, tùy thuộc vào sở thích mà các bạn có thể cho nhiều hoặc ít bơ.\n" +
                "Tiếp đến các bạn cho 1 muỗng nước tương vào. Tiếp theo các bạn sắp xếp 1 lớp chả kèm 1 lớp dưa leo để cho thật đều, sau khi các bạn cảm thấy vừa đủ thì các bạn cho mấy cọng hành ngò lên phía trên. Tiếp theo, các bạn chỉ còn \n" +
                "thái bánh mì ra thành từng khúc hoặc để nguyên rồi bắt đầu thưởng thức món bánh mì chả thôi nào."));
        list.add(new UserCooking(R.drawable.hamburger,"Hamburger","Nguyên liệu cho cách làm Hamburger nhân thịt bò:\n" +
                "(Cho 4 người ăn)\n" +
                "- Thịt bò xay: 300gr\n" +
                "- Bánh mì tròn bình thường hoặc vỏ bánh Hamburger (mua tại các siêu thị, tiệm bánh): 4 chiếc\n" +
                "- Bột chiên xù: 40gr\n" +
                "- Phô mai cắt lát: 4 – 8 lát( 1 bánh có thể cho 1 – 2 lát phô mai tùy sở thích)\n" +
                "- Cà chua: 2 quả\n" +
                "- Hành tây: 1 củ\n" +
                "- Trứng gà: 4 quả\n" +
                "- Xà lách: 4 lá\n" +
                "- Gia vị: muối, đường, nước mắm, tương cà, tương ớt\n" +
                "Cách làm Hamburger nhân thịt bò:\n" +
                "Bước 1:\n" +
                "- Cho thịt bò, bột chiên xù, trứng gà vào bát to, trộn đều. Thêm 1 thìa nước mắm, 2 thìa đường vào trộn tiếp, ướp trong 30 phút cho hỗn hợp thịt, trứng, bột ngấm đều gia vị.\n" +
                "Bước 2:\n" +
                "- Hành tây bóc vỏ, rửa sạch, thái miếng nhỏ vừa. Cà chua rửa sạch, thái khoanh nhỏ vừa ăn. Xà lách bỏ cuống, rửa sạch, tách từng lá một.\n" +
                "- Đun nóng dầu ăn, cho hành tây vào xào tái rồi đổ ra để ráo dầu. Hành tây sau khi xào sẽ bớt cay nồng, dễ ăn hơn.\n" +
                "- Nặn hỗn hợp thịt bò thành bốn phần tròn, dẹt, có đường kính bằng với đường kính bánh mì đã chuẩn bị. Cho thịt bò vào chảo dầu nóng, chiên lửa nhỏ cho tới khi thịt chín, bên ngoài xém vàng là được.\n" +
                "Bước 3:\n" +
                "- Cắt đôi bánh mì theo chiều ngang, đặt lá xà lách rồi đến một lát cà chua, hành tây, phô mai lên trên một nửa chiếc bánh. Đặt nhân thịt bò vào giữa, xếp các loại rau, phô mai như lúc nãy lên trên miếng thịt bò, cuối cùng đặt nửa bánh mì còn lại lên.\n" +
                "- Tiếp tục làm như vậy với phần nguyên liệu còn lại.\n" +
                "Lưu ý cho cách làm Humburger:\n" +
                "- Bạn có thể tăng giảm lượng rau và phô mai theo khẩu vị. Áp chảo bánh mì khiến bánh thơm ngon hơn.\n" +
                "- Chiên thêm trứng ốp để làm phần nhân nếu muốn bánh Hamburger thêm bổ dưỡng.\n" +
                "- Nên chọn thịt bò có mỡ để bánh có vị béo ngậy tự nhiên.\n" +
                "Như vậy, chiếc Hamburger bò đã hoàn thành rồi đó. Chiếc bánh tròn xinh vàng ươm với phần nhân thịt bùi bùi thơm ngọt bên trong, giòn rụm bên ngoài, một lát phô mai béo ngậy đang tan chảy nằm giữa những lá xà lách xanh mướt và\n" +
                " khoanh cà chua đỏ au. Ăn cùng chút tương ớt cay cay, tương cà ngọt ngọt, một miếng Hamburger nho nhỏ cũng đủ “đánh gục” những cái dạ dày khó chiều nhất.\n"));

        list.add(new UserCooking(R.drawable.pho,"Phở","Nguyên liệu làm Phở bò\n" +
                "- Bò phi lê 1.2 kg\n" +
                "- Xương ống bò 2 kg\n" +
                "- Bắp bò 0.7 kg\n" +
                "- Hoa hồi 50 gr\n" +
                "- Bánh phở 1 kg\n" +
                "- Đinh hương 100 gr\n" +
                "- Thảo quả 100 gr\n" +
                "- Hạt ngò 50 gr\n" +
                "- Giá sống 300 gr\n" +
                "- Sả 2 nhánh\n" +
                "- Hành tây 1 củ\n" +
                "- Vỏ quýt 100 gr\n" +
                "- Rau ăn kèm 1 ít\n" +
                "(ngò ôm/ngò gai)\n" +
                "- Gừng 1 củ\n" +
                "- Gia vị thông dụng 1 ít\n" +
                "(muối/hạt nêm/bột ngọt/tiêu/đường)\n" +
                "1.Sơ chế nguyên liệu hầm nước dùng\n" +
                "Cho sả cây vào nồi nước lớn, đun sôi sau đó cho xương ống bò vào chần qua một lần để khử mùi hôi của xương bò.\n" +
                "Tiếp đó cho xương ống bò vào khay nướng cùng với gừng và hành tây, rồi đặt khay vào lò nướng khoảng 5 đến 10 phút cho đến khi xương ống bò xém cạnh thì gắp xương ống bò thả vào thau nước đá.\n" +
                "Tiếp đến, trải một tấm khăn mùng sạch ra mặt phẳng, cho thảo quả, vỏ quýt, đinh hương, hoa hồi và hạt ngò vào giữa tấm khăn. Bạn túm các mép khăn lại bọc kín nguyên liệu sau đó cột túm bằng một sợi dây chỉ.\n" +
                "2. Sơ chế nguyên liệu hầm nước dùng\n" +
                "Cho sả cây vào nồi nước lớn, đun sôi sau đó cho xương ống bò vào chần qua một lần để khử mùi hôi của xương bò.\n" +
                "Tiếp đó cho xương ống bò vào khay nướng cùng với gừng và hành tây, rồi đặt khay vào lò nướng khoảng 5 đến 10 phút cho đến khi xương ống bò xém cạnh thì gắp xương ống bò thả vào thau nước đá.\n" +
                "Tiếp đến, trải một tấm khăn mùng sạch ra mặt phẳng, cho thảo quả, vỏ quýt, đinh hương, hoa hồi và hạt ngò vào giữa tấm khăn. Bạn túm các mép khăn lại bọc kín nguyên liệu sau đó cột túm bằng một sợi dây chỉ.\n" +
                "3. Sơ chế nguyên liệu khác\n" +
                "Lột vỏ hành tây rồi thái lát mỏng. Thái nhỏ hành ngò.\n" +
                "Thịt bò phi lê thái thành những lát mỏng, nên thái theo thớ để thịt bò không bị dai khi chế biến.\n" +
                "Luộc sơ bắp bò qua nước sôi để bắp bò săn lại rồi đem thái thành những miếng mỏng.\n" +
                "Chần giá cùng đầu hành qua nước sôi. Chần sơ bánh phở qua nước sôi 1 lần.\n" +
                "4. Thành phẩm\n" +
                "Chuẩn bị tô lớn, cho hành giá vừa chần vào đáy tô, rồi đến bánh phở. Cho thịt bò phi lê và bắp bò thái lát vào tô, múc một muỗng hành ngò thái nhỏ cùng hành tây thái lát và một ít tiêu lên phía trên phần thịt bò và cuối cùng là chan nước dùng nóng hổi vào.\n" +
                "Phở bò có hương thơm đặc trưng của nước hầm xương bò và hoa hồi, vị ngọt béo kèm với bánh phở mịn. Thưởng thức bát phở khi còn nóng, bạn nhé!\n" +
                "\n"));
        list.add(new UserCooking(R.drawable.kimchi,"Kim chi","Cách làm kim chi cải thảo Hàn Quốc\n" +
                "Kim chi cải thảo là món ăn truyền thống trong văn hóa ẩm thực của Hàn Quốc mà đã trở thành món ăn kèm phổ biến ở Việt Nam. Cách thực hiện món này cũng rất đơn giản, nguyên liệu dễ tìm. \n" +
                "Chỉ sau khoảng 3 giờ làm là bạn đã có ngay một mẻ kim chi cải thảo Hàn Quốc siêu ngon. Giờ thì bắt tay vào thực hiện thôi.\n" +
                "Chuẩn bị nguyên liệu  làm kim chi cải thảo Hàn Quốc\n" +
                "- 1-2 bắp cải thảo\n" +
                "- Củ cải\n" +
                "- 1 củ hành tây\n" +
                "- 5 cụm lớn hành lá\n" +
                "- 2 trái ớt cay (nếu muốn cay hơn thì bạn có thể cho thêm)\n" +
                "- 1/2 chén ớt bột  \n" +
                "- 1/2 quả táo \n" +
                "- Tỏi băm\n" +
                "- 1/3 chén nước mắm\n" +
                "- 2 muỗng cà phê vừng\n" +
                "- 1/2 thìa gừng băm\n" +
                "- 3 thìa bột gạo nếp\n" +
                "Chuẩn bị nguyên liệu đã và bắt tay vào làm ngay nào!\n" +
                "Hướng dẫn cách làm kim chi cải thảo\n" +
                "Bước 1: Sơ chế \n" +
                "Tách cải thảo ra từng lá (chú ý cắt bỏ phần hư, úng, dập, thâm,…) sau đó ngâm vào chậu nước ấm cùng nửa chén muối hột.\n" +
                "Lấy 2/3 chén muối i-ốt hoặc muối hột chà xát lên cải thảo đang ngâm, chà xát kỹ ở phần cọng và phần lõi của cải thảo.\n" +
                "Sau đó ngâm cải thảo vào thau nước nuối ấm. Đè cho toàn bộ cải thảo ngập trong nước muối khoảng 4-5 giờ đồng hồ để cải thảo ngấm đều muối và mềm ra.\n" +
                "Sau khi đã hoàn thành công đoạn trên thì vớt cải thảo ra và rửa lại bằng nước lạnh rồi để cho ráo nước.\n" +
                "Bước 2: Làm gia vị \n" +
                "Chuẩn bị một bát to cho vào 3 thìa bột gạo nếp và 3 muỗng nước, khuấy đều sau đó đổ vào nồi và bắc lên bếp. Vặn nhỏ lửa, cho thêm 2 muỗng nước kết hợp với khuấy đều khoảng 10 phút để khỏi bị vón cục là được.\n" +
                "Thái lát hành tây và rửa sạch. Cắt khúc cọng hành khoảng 5 cm \n" +
                "Gọt vỏ củ cải rồi đem rửa sạch và thái chỉ \n" +
                "Thải ớt  mỏng theo từng khoanh. \n" +
                "Táo và hành tây thì bỏ vào cối xay nhuyễn.\n" +
                "Bước 3: Ướp kim chi\n" +
                "Chuẩn bị một thau lớn và sau đó cho toàn bộ các nguyên liệu vào: bột vừa đun, củ cải thái chỉ, ớt bột, hành tây thái lát, ớt cay, hành, táo hành xay nhuyễn, 2 thìa đường, 1/3 chén nước mắm, 3 thìa tỏi băm, 1/2 thìa gừng băm và 2 thìa vừng rang. \n" +
                "Dùng tay có mang găng sạch trộn đều hỗn hợp lên.\n" +
                "Sau khi các loại gia vị đã được trộn đều, quết hỗn hợp trên phủ khắp tất cả các mặt của cải thảo đã để ráo nước.\n" +
                "Công đoạn cuối cùng là bỏ kim chi vào lọ kín đậy nắp lại, để ở nhiệt độ phòng 1 ngày sau đó cho vào ngăn mát của tủ lạnh. Bạn có thể lấy ra thưởng thức từ 2-3 ngày sau.\n" +
                "Kim chi phải chăng đã quá phổ biến tại Hàn Quốc và thậm chí là nhiều nước khác. Nhưng Việt Nam cũng không hề thua kém Hàn Quốc khi vẫn có thể chế biến ra món kim chi củ cải trắng mang đậm chất hương vị Việt.\n" +
                "\n"));
        list.add(new UserCooking(R.drawable.bbq,"Thịt xiên nướng","1. Thịt xiên nướng chuẩn vị Hà Nội\n" +
                "Nguyên liệu làm Thịt xiên nướng chuẩn vị Hà Nội\n" +
                "- Hành tím 1 củ\n" +
                "(hoặc 2 củ hành khô)\n" +
                "- Tỏi 1 củ\n" +
                "- Sả 1 nhánh\n" +
                "- Nước hàng 3 muỗng canh\n" +
                "- Nước mắm 50 ml\n" +
                "- Dầu hào 3 muỗng canh\n" +
                "- Dầu vừng 2 muỗng cà phê\n" +
                "- Thịt nạc vai 400 g\n" +
                "(chọn loại có cả nạc lẫn mỡ - có thể thay bằng thịt ba chỉ)\n" +
                "- Gia vị: Hạt tiêu, que tre, vừng trắng\n" +
                "Cách chế biến Thịt xiên nướng chuẩn vị Hà Nội\n" +
                "1. Sơ chế nguyên liệu\n" +
                "Que tre sau khi mua về mình rửa sơ rồi luộc qua nước sôi. Thịt thái miếng mỏng vừa (miếng thịt quá dày sẽ khó cuốn vào xiên, còn thịt mỏng quá thì sẽ mất nhiều thời gian cuốn). Hành tím, tỏi, sả băm nhỏ.\n" +
                "Ướp thịt với một ít nước mắm, nước hàng, dầu hào, đường, hành, tỏi, sả, dầu vừng, hạt tiêu, vừng trắng (không bắt buộc). Để từ 2-3 tiếng cho ngấm gia vị vào thịt.\n" +
                "2. Xiên thịt vào que tre\n" +
                "Thịt vụn và các dải thịt nhỏ cuốn vào trong. Miếng thịt lớn hơn thì cuốn ra ngoài xiên. Khi cuốn xong thì lấy tay nắn đều cho xiên thịt tròn đều.\n" +
                "Lưu ý là không nên làm xiên thịt quá dày và cuốn quá chặt vì sẽ mất thời gian nướng và khả năng bên ngoài cháy, bên trong sống sẽ cao.\n" +
                "3. Nướng thịt\n" +
                "Nướng thịt bằng vỉ nướng trên bếp than là ngon nhất. Nếu không, các có thể nướng bằng lò nướng với mức nhiệt 200 độ C trong 30 – 35 phút. Trong quá trình nướng cần lật mặt xiên thịt để thịt chín đều.\n" +
                "4. Thành phẩm\n" +
                "Thịt xiên nướng có màu vàng vàng, thơm ngát, và ăn ngay khi còn nóng.\n" +
                "Quan trọng nhất là ướp thịt lúc đầu. Khi nướng xong thịt phải mềm, nạc lẫn mỡ nên không bị khô và không bị ngấy, vị đậm đà mặn ngọt vừa ăn, rất thơm nhờ hành tỏi, và đặc biệt là dậy mùi sả và vừng.\n"));
        list.add(new UserCooking(R.drawable.mixrice,"Cơm trộn ","Nguyên liệu để nấu 1 nồi cơm cho 3 - 4 người ăn\n" +
                "- 2,5 chén gạo\n" +
                "- 2 trái bắp mỹ\n" +
                "- 2 củ cà rốt\n" +
                "- 400g đậu cove\n" +
                "- 4 cây xúc xích\n" +
                "- Hành tím, tỏi\n" +
                "Gia vị: Hạt nêm, muối, đường, ớt bột, nước tương\n" +
                "Cách nấu cơm trộn thập cẩm\n" +
                "Bước 1: Sơ chế nguyên liệu\n" +
                "- Xúc xích mình sẽ cắt hạt lựu, đậu cove mình sẽ cắt khúc nhỏ, cà rốt thì mình gọt vỏ rồi cắt hạt lựu luôn, với bắp thì mình sẽ tách hạt bắp ra, còn hành tím thì cắt thành lát, tỏi thì băm nhuyễn.\n" +
                "Bước 2: Làm dầu hành tỏi\n" +
                "Sau khi sơ chế nguyên liệu xong, mình sẽ tiến hành làm dầu hành tỏi nha. Cho một ít dầu ăn vào chảo rồi phi một ít tỏi cho vàng thơm, sau đó bạn cho hành tím vào và phi chung luôn.\n" +
                "Mình làm dầu hành tỏi này để xíu mình cho sẽ cho lên bề mặt gạo, khi nấu chín, hạt cơm bóng bẩy, căng tròn trông rất hấp dẫn.\n" +
                "Bước 3: Vo gạo và nấu cơm\n" +
                "Bây giờ mình sẽ bắt đầu vo gạo nha, mình sẽ nấu khoảng 2,5 chén gạo. Bạn chỉ nên vo 1 - 2 lần thôi, nếu vo nhiều lần quá sẽ mất đi lớp cám gạo bên ngoài là mất chất dinh dưỡng đó. \n" +
                "Sau khi vo gạo xong, mình sẽ cho gạo vào lòng nồi cơm rồi rải đều một nửa phần dầu hành tỏi vừa làm xong lên trên bề mặt gạo.\n" +
                "Bước tiếp theo, mình sẽ cho các nguyên liệu mà mình đã sơ chế sẵn lên trên phần gạo, xanh xanh đỏ đỏ vàng vàng rất đẹp mắt đúng không nào. Mình sẽ cho vào nồi khoảng 3,5 chén nước, \n" +
                "nêm thêm vào 1 muỗng canh hạt nêm, nửa muỗng canh muối, một ít tiêu xay nhuyễn, tiêu thì bạn cho nhiều hoặc ít tùy vào sở thích nhé. Cuối cùng, cho lòng nồi vào nồi cơm điện và tiến hành nấu như bình thường.\n" +
                "Bước 4: Làm nước sốt\n" +
                "Trong thời gian chờ cơm chín, mình sẽ làm nước sốt để xíu rưới lên cơm nhé. Mình sẽ cho phần dầu hành tỏi còn dư vào chảo và đảo đều. Cho thêm vào 100ml nước tương, 1 muỗng canh hạt nêm, 50g đường, tiếp tục đảo.\n" +
                "Để phần nước sốt này ngon hơn thì mình sẽ cho thêm vào đây bột ớt, tùy vào độ ăn cay của bạn mà cho nhiều hoặc ít nhé. Bạn nấu đến khi nào mà nước sốt bắt đầu sệt lại thì bạn tắt bếp được rồi đó, cho phần nước sốt này ra một cái chén.\n" +
                "Thành phẩm\n" +
                "Khi cơm chín, mở nắp nồi là cảm nhận được mùi thơm liền luôn. Bây giờ mình sẽ trộn đều tất cả lên nhé. Mình sẽ múc cơm ra một cái thố, rưới phần nước sốt lên trên, rồi tiếp tục cho lên trên một ít tiêu, vậy là chúng ta đã hoàn thành món này rồi.\n" +
                "Cơm trộn thập cẩm được nấu bằng nồi cơm điện sẽ giúp gạo mềm, dẻo cộng với rau củ tươi ngon, thêm phần nước sốt thần thánh nữa, rất là ngon luôn. Vào dịp cuối tuần, bạn có thể thay đổi thực đơn của gia đình bằng món này nha, đảm bảo ăn sẽ không ngán luôn đó."));
        list.add(new UserCooking(R.drawable.healthyfood1,"Cơm trộn cá hồi","Nguyên Liệu\n" +
                "cho hai người ăn\n" +
                "- 2 bát cơm nóng\n" +
                "- 200 gr cá hồi\n" +
                "- 1 củ cà rốt\n" +
                "- 1 gói rong biển ăn liền\n" +
                "- 2 quả trứng\n" +
                "Dầu mè, dầu ăn, gia vị rắc cơm Nhật hoặc Hàn, mayonnaise\n" +
                "Các bước\n" +
                "Bước 1: Rán cá hồi. Cá chín cho vào bát dùng thìa nghiền nhỏ\n" +
                "Bước 2: Luộc trứng\n" +
                "Bước 3: Cà rốt thái chỉ, xào chín với ít dầu mè\n" +
                "Bước 4: Trình bày: cho cơm vào bát, phủ cá hồi, cà rốt, rong biển lên trên. Cho gia vị rắc cơm, trứng cắt đôi và sốt mayonnaise lên trên cùng. Trộn đều và ăn nóng."));

        list.add(new UserCooking(R.drawable.healthyfood2,"Cơm gà trắng","Nguyên liệu chính cho món cơm gà\n" +
                "- gà ta 1,5kg ( tùy vào số lượng người ăn)\n" +
                "- gạo tám thơm 500g\n" +
                "- nghệ 1 củ\n" +
                "- lòng gà\n" +
                "- nộm ăn kèm là nộm đu đủ và nộm hành tây\n" +
                "Cách làm cơm gà \n" +
                "Bước 1: Đầu tiên thit gà rửa sạch sát muối rồi cho vào nồi luộc thêm mấy lát gừng để gà không bị hôi, luộc tầm 15-20 không nên luộc gà chín sẽ bị nát\n" +
                "Bước 2: Tiếp theo, đem gạo vo sạch trộn với nước nghệ tươi cho vàng đều rồi rồi đổ nước luộc gà cắm cơm lên\n" +
                "Bước 3: Nộm đu đủ bào sợi rồi cho muối, đường , rau thơm bóp chua chua\n" +
                "Bước 4: Lòng gà làm sạch rồi xào thơm lên\n" +
                "Bước 5: Cuối cùng trang trí ra đĩa cùng với dưa chuột và cà chua"));


        return list;
    }
}