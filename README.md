<h1>🔗2.3. Clean Architecture:</h1>

<h2>🔹1. Kiến trúc tổng thể Clean Architecture</h2>

Clean Architecture (Robert C. Martin - Uncle Bob) là mô hình kiến trúc hướng tâm, chia hệ thống thành các vòng tròn phụ thuộc, nơi phụ thuộc chỉ được phép từ ngoài vào trong, không có chiều ngược lại:

![image](https://github.com/user-attachments/assets/eac30f6a-b01e-4899-a185-771cd73527d7)


<h2>🔹2. Cấu trúc thư mục dự án Clean Architecture</h2>

![image](https://github.com/user-attachments/assets/a1078198-af8f-468c-ab02-1eb98a872a36)

<h2>🔹3. Mã nguồn mẫu: </h2>

```https://github.com/thinhotwp1/Clean-Architecture```

<h2>🔹4. Ưu điểm của Clean Architecture</h2>

![image](https://github.com/user-attachments/assets/1db927af-ba84-4987-b5d6-f34da4d09b18)

<h2>🔹5. Một số dự án thực tế sử dụng Clean Architecture</h2>

![image](https://github.com/user-attachments/assets/53869348-cbaf-4a04-963d-a12fc65cf1fa)

<h2>🔹6. Khi nào nên dùng Clean Architecture?</h2>

![image](https://github.com/user-attachments/assets/37a46ea2-4b90-467f-979f-296809abbc7a)

<h2>🔍 So sánh Clean Architecture vs Hexagonal</h2>

![image](https://github.com/user-attachments/assets/0382cf75-deef-4595-be63-c7dca406ec95)

![image](https://github.com/user-attachments/assets/ede5df46-eff9-4103-9ed4-810e7a27389e)

<h2>🚀 Netflix kết hợp Clean + Hexagonal như thế nào?</h2>

- Netflix (và một số công ty lớn) kết hợp cả hai mô hình như sau:

- Use Cases (Clean) được gọi qua Input Port (Hexagonal).

- Adapter như REST/Kafka/... implement Input Port hoặc gọi vào UseCase (tùy logic).

- Output Port (Hexagonal) là interface mà UseCase gọi để lưu DB, gửi message,...

- Các Adapter implement Output Port để connect DB, Kafka, Mail,...


👉 Nói cách khác:

- Clean Architecture giúp chia logic theo nghiệp vụ.

- Hexagonal giúp "cắm" thêm adapter dễ dàng, mỗi adapter là một "hexagon port".


✅ Khi nào nên dùng Hexagonal, Clean, hoặc kết hợp?

![image](https://github.com/user-attachments/assets/d8bd9dc7-db32-44c6-ac30-2fefa2ab0e86)
