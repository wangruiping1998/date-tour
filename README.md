# date-tour
旅游类app，开启两人的约会之旅吧

## 技术
前后端分离架构，前端使用微信小程序开发，后端采用最新的springboot4.0.3

## 核心业务
1. 全国5A景区展示
2. 景点打卡分享
3. 用户旅游探讨
4. 游玩推荐


## 数据来源
1. 国家天地图行政区划数据（省市县）：https://cloudcenter.tianditu.gov.cn/administrativeDivision/
2. 全国5A景点（截止2023年）：https://gitcode.com/Universal-Tool/de21c https://sjfw.mct.gov.cn/site/dataservice/rural?type=10

数据入库
```shell
shp2pgsql -s 4490 -I C:\Users\13456\Desktop\region.shp temp.region > C:\Users\13456\Desktop\region.sql
psql -d date_tour -p 5437 -U postgres -f C:\Users\13456\Desktop\region.sql
```

## 数据处理
```sql

delete from region;
INSERT INTO public.region(
id, pac, pac_name, geom, centric_lng, centric_lat)
select gid,substring(gb,4,2),name,geom, st_x(st_centroid(geom)), st_y(st_centroid(geom)) from temp.region where layer = '中国_省'
union all
select gid,substring(gb,4,4),name,geom, st_x(st_centroid(geom)), st_y(st_centroid(geom)) from temp.region where layer = '中国_市'
union all
select gid,substring(gb,4,6),name,geom, st_x(st_centroid(geom)), st_y(st_centroid(geom)) from temp.region where layer = '中国_县';
	
```
