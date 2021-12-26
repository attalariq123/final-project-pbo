CREATE TABLE IF NOT EXISTS admin (
    username VARCHAR(32) NOT NULL PRIMARY KEY,
    password VARCHAR(32) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS cashier (
    id int(4) NOT NULL PRIMARY KEY,
    nama VARCHAR(32) NOT NULL,
    umur VARCHAR(32) NOT NULL,
    alamat VARCHAR(32) NOT NULL,
    `no telp` VARCHAR(32) NOT NULL,
    username VARCHAR(32) NOT NULL,
    password VARCHAR(32) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS customer (
    id int(4) NOT NULL PRIMARY KEY,
    nama VARCHAR(32) NOT NULL,
    umur VARCHAR(32) NOT NULL,
    alamat VARCHAR(32) NOT NULL,
    `no telp` VARCHAR(32) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS produk (
    id int(4) NOT NULL PRIMARY KEY,
    nama VARCHAR(32) NOT NULL,
    harga VARCHAR(32) NOT NULL,
    kuantitas int(4) NOT NULL,
    deskripsi VARCHAR(32) NOT NULL,
    kategori VARCHAR(32) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS `kategori produk` (
    id int(4) NOT NULL PRIMARY KEY,
    nama VARCHAR(32) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4;

INSERT INTO `admin` (`username`, `password`) VALUES ('admin','admin');

INSERT INTO `cashier` (id, nama, umur, alamat, `no telp`, username, password) VALUES ('1','Bilal', '20','Bekasi','08121212', 'kasirsatu', 'kasir');
INSERT INTO `cashier` (id, nama, umur, alamat, `no telp`, username, password) VALUES ('2','Fauzi', '20','Sukoharjo','08131313', 'kasirdua', 'kasir');
INSERT INTO `cashier` (id, nama, umur, alamat, `no telp`, username, password) VALUES ('3','Rafi', '20','Bandung','08141414', 'kasirtiga', 'kasir');
INSERT INTO `cashier` (id, nama, umur, alamat, `no telp`, username, password) VALUES ('4','Bagus', '20','Solo','08151515', 'kasirempat', 'kasir');
INSERT INTO `cashier` (id, nama, umur, alamat, `no telp`, username, password) VALUES ('5','Naufal', '20','Tangerang','08161616', 'kasirlima', 'kasir');

INSERT INTO `customer` (id, nama, umur, alamat, `no telp`) VALUES ('1','Hafid Ahmad', '20','Purwakarta','08131313');
INSERT INTO `customer` (id, nama, umur, alamat, `no telp`) VALUES ('2','Attalariq', '20','Batam','08141414');
INSERT INTO `customer` (id, nama, umur, alamat, `no telp`) VALUES ('3','Azhar', '20','Sumedang','08151515');
INSERT INTO `customer` (id, nama, umur, alamat, `no telp`) VALUES ('4','Irwan', '20','Solo','08161616');
INSERT INTO `customer` (id, nama, umur, alamat, `no telp`) VALUES ('5','Restu', '20','Subang','08171717');

INSERT INTO `produk` (id, nama, harga, kuantitas, deskripsi, kategori) VALUES ('1','Daging Ayam', '20000','5','Daging segar', 'Makanan');
INSERT INTO `produk` (id, nama, harga, kuantitas, deskripsi, kategori) VALUES ('2','Asus ROG', '5000000','10','Laptop gaming', 'Elektronik');
INSERT INTO `produk` (id, nama, harga, kuantitas, deskripsi, kategori) VALUES ('3','Panci', '80000','2','Panci masak', 'Alat Masak');
INSERT INTO `produk` (id, nama, harga, kuantitas, deskripsi, kategori) VALUES ('4','Jaket Kulit', '500000','20','Jaket anti-air', 'Pakaian');
INSERT INTO `produk` (id, nama, harga, kuantitas, deskripsi, kategori) VALUES ('5','Teh Hijau', '10000','6','Minuman sehat', 'Minuman');

INSERT INTO `kategori produk` (id, nama) VALUES ('1','Makanan');
INSERT INTO `kategori produk` (id, nama) VALUES ('2','Elektronik');
INSERT INTO `kategori produk` (id, nama) VALUES ('3','Alat Masak');
INSERT INTO `kategori produk` (id, nama) VALUES ('4','Pakaian');
INSERT INTO `kategori produk` (id, nama) VALUES ('5','Minuman');