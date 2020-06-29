INSERT INTO sys_menu (menu_id, menu_name, parent_id, order_num, url, target, menu_type, visible, perms, icon,
                         create_by, create_time, update_by, update_time, remark)
VALUES (5, '客户管理', 0, 0, '#', '', 'M', '0', '', 'fa fa-users', 'admin', '2020-06-16 11:33:00', 'ry',
        '2020-06-16 11:33:00', '系统管理目录');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户信息', '5', '1', '/crm/customer', 'C', '0', 'crm:customer:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '客户信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户信息查询', @parentId, '1',  '#',  'F', '0', 'crm:customer:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户信息新增', @parentId, '2',  '#',  'F', '0', 'crm:customer:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户信息修改', @parentId, '3',  '#',  'F', '0', 'crm:customer:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户信息删除', @parentId, '4',  '#',  'F', '0', 'crm:customer:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户信息导出', @parentId, '5',  '#',  'F', '0', 'crm:customer:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');


-- 客户申请状态 SQL
INSERT INTO sys_dict_type (dict_name, dict_type, status, create_by, create_time, update_by, update_time,
                           remark)
VALUES ('客户申请状态', 'customer_apply_status', '0', 'admin', '2020-06-17 19:54:13', 'admin', '2020-06-16 19:54:37',
        '客户申请状态');
INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class,
                           is_default, status, create_by, create_time, update_by, update_time, remark)
VALUES (1, '待沟通', '1', 'customer_apply_status', null, null, 'Y', '0', 'admin', '2020-06-04 19:55:39', '', null, null);
INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class,
                           is_default, status, create_by, create_time, update_by, update_time, remark)
VALUES (2, '试用中', '2', 'customer_apply_status', null, null, 'Y', '0', 'admin', '2020-06-04 19:55:50', '', null, null);
INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class,
                           is_default, status, create_by, create_time, update_by, update_time, remark)
VALUES (3, '试用结束', '3', 'customer_apply_status', null, null, 'Y', '0', 'admin', '2020-06-04 19:56:02', '', null, null);
INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class,
                           is_default, status, create_by, create_time, update_by, update_time, remark)
VALUES (4, '已签单', '4', 'customer_apply_status', null, null, 'Y', '0', 'admin', '2020-06-04 19:56:13', '', null, null);