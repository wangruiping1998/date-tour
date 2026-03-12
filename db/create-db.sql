CREATE TABLE IF NOT EXISTS public.scenic_spot
(
    id bigint NOT NULL,
    create_time timestamp without time zone NOT NULL DEFAULT now(),
    update_time timestamp without time zone NOT NULL DEFAULT now(),
    deleted smallint NOT NULL DEFAULT 0,
    name varchar NOT NULL,
    level smallint NOT NULL,
    address varchar,
    description text,
    url varchar,
    pac varchar,
    pac_name varchar,
    geom geometry,
    centric_lng numeric,
    centric_lat numeric,
    CONSTRAINT scenic_spot_pkey PRIMARY KEY (id)
);

COMMENT ON TABLE public.scenic_spot
    IS '全国景区数据表';

CREATE TABLE IF NOT EXISTS public.region
(
    id bigint NOT NULL,
    create_time timestamp without time zone NOT NULL DEFAULT now(),
    update_time timestamp without time zone NOT NULL DEFAULT now(),
    deleted smallint NOT NULL DEFAULT 0,

    pac varchar NOT NULL,
    pac_name varchar NOT NULL,
    geom geometry,
    centric_lng numeric,
    centric_lat numeric,
    CONSTRAINT region_pkey PRIMARY KEY (id)
);

COMMENT ON TABLE public.region
    IS '全国行政区划数据表';

CREATE TABLE IF NOT EXISTS public.user
(
    id bigint NOT NULL,
    create_time timestamp without time zone NOT NULL DEFAULT now(),
    update_time timestamp without time zone NOT NULL DEFAULT now(),
    deleted smallint NOT NULL DEFAULT 0,

    username varchar NOT NULL,
    password varchar NOT NULL,
    real_name varchar,
    birthday date,
    gender smallint,
    url varchar,
    phone varchar,
    email varchar,
    qq varchar,
    openid varchar,
    profile varchar,
    pac varchar,
    CONSTRAINT user_pkey PRIMARY KEY (id)
);

COMMENT ON TABLE public.user
    IS '用户表';
CREATE UNIQUE INDEX idx_user_username ON public.user (username);
CREATE UNIQUE INDEX idx_user_phone ON public.user (phone);

CREATE TABLE IF NOT EXISTS public.user_spot_checkins
(
    id bigint NOT NULL,
    create_time timestamp without time zone NOT NULL DEFAULT now(),
    update_time timestamp without time zone NOT NULL DEFAULT now(),
    deleted smallint NOT NULL DEFAULT 0,

    user_id bigint NOT NULL,
    spot_id bigint NOT NULL,

    CONSTRAINT user_spot_checkins_pkey PRIMARY KEY (id)
);

COMMENT ON TABLE public.user_spot_checkins
    IS '用户景点打卡表';




-- 景点攻略（以地图路线为主）
CREATE TABLE IF NOT EXISTS public.travel_strategy
(
    id bigint NOT NULL,
    create_time timestamp without time zone NOT NULL DEFAULT now(),
    update_time timestamp without time zone NOT NULL DEFAULT now(),
    deleted smallint NOT NULL DEFAULT 0,

    user_id bigint NOT NULL,
    spot_id bigint NOT NULL,
    text_content text,
    map_content text,
    CONSTRAINT travel_strategy_pkey PRIMARY KEY (id)
);

COMMENT ON TABLE public.travel_strategy
    IS '旅游攻略表';

-- 景点分享（以照片为主）
CREATE TABLE IF NOT EXISTS public.spot_travel_share
(
    id bigint NOT NULL,
    create_time timestamp without time zone NOT NULL DEFAULT now(),
    update_time timestamp without time zone NOT NULL DEFAULT now(),
    deleted smallint NOT NULL DEFAULT 0,

    user_id bigint NOT NULL,
    spot_id bigint NOT NULL,
    content text,
    pics varchar[],
    star smallint,
    CONSTRAINT spot_travel_share_pkey PRIMARY KEY (id)
);

COMMENT ON TABLE public.spot_travel_share
    IS '景点分享表';

-- 评论（包括景点、分享、攻略）
CREATE TABLE IF NOT EXISTS public.user_comment
(
    id bigint NOT NULL,
    create_time timestamp without time zone NOT NULL DEFAULT now(),
    update_time timestamp without time zone NOT NULL DEFAULT now(),
    deleted smallint NOT NULL DEFAULT 0,

    user_id bigint NOT NULL,
    data_id bigint NOT NULL,
    parent_id bigint,
    content text,
    pics varchar[],
    CONSTRAINT user_comment_pkey PRIMARY KEY (id)
);

COMMENT ON TABLE public.user_comment
    IS '用户评论表';


