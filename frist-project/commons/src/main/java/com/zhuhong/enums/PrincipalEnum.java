package com.zhuhong.enums;

import java.util.EnumSet;

/**
 * <p>Description: [生成主键KEY枚举类]</p>
 *
 * @author <a href="mailto: cuichunsong@camelotchina.com">崔春松</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 */
public enum PrincipalEnum {

    APP_USER("table_id_app_user", ""),

    SYS_APP("sys_application", "系统应用表"),

    SYS_APP_TYPE("sys_app_type", "系统应用类型表"),

    SYS_PERMISSION("sys_permission", "系统权限表"),

    SYS_OPERATE_ROLE("sys_operate_role", "系统操作角色表"),

    SYS_OPERATE_APP("sys_operate_app", "操作角色-系统应用关联表"),

    SYS_OPERATE_PERMISSION("sys_operate_permission", "操作角色-系统权限关联表"),

    SYS_ORG("sys_org", "组织架构表"),

    CRM_PROJECT_INFO("crm_project_info", "项目详情表"),

    CRM_PROJECT_PRODUCT_INFO("crm_project_product_info", "项目产品明细表"),

    CRM_REG_CLIENT("crm_reg_client", "客户登记表"),

    CRM_CHANCE_CONTACT("crm_chance_contact", "商机联系人关联表"),

    CRM_CONTACT("crm_contact", "联系人表"),

    CRM_CHANCE_INFO("CRM_CHANCE_INFO", "商机信息表"),

    CRM_CHANCE_RECORD("crm_chance_record", "商机记录表"),

    CRM_CHANCE_FEEDBACK("crm_chance_feedback", "商机跟进与反馈表"),

    CRM_CLIENT_PROFILE("crm_client_profile", "客户档案表"),

    CRM_CHANCE_OFFER("crm_chance_offer", "商机报价单据项目详情表"),

    CRM_CHANCE_BID("crm_chance_bid", "商机投标单据表"),

    CRM_CHANCE_DEAL_INFO("crm_chance_deal_info", "转交易单据"),

    CRM_CHANCE_DEAL_PRODUCT("crm_chance_deal_product", "转交易产品明细表"),

    CRM_JOB_RECORD("crm_job_record", "定时任务记录表"),

    CRM_WORKFLOW_RECORD("crm_workflow_record", "工作流ID记录表"),

    CRM_FILE_RECORD("crm_file_record", "文件记录表"),

    CRM_TRACK_RECORD("CRM_TRACK_RECORD", "轨迹记录表"),

    SYS_PERSON_INFO("sys_person_info", "人员信息表"),

    SYS_ACCOUNT("sys_account", "系统账号表"),

    SYS_ACC_PWD("sys_acc_pwd", "账号密码管理表"),

    SYS_ACC_OPERATE("sys_acc_operate", "账号-操作角色关联表"),

    SYS_ACC_DATA("sys_acc_data", "账号-数据角色关联表"),

    SYS_ACC_ORG("sys_acc_org", "账号-组织架构关联表"),

    SYS_SPECIAL_ROLE("sys_special_role", "特殊角色关系表"),

    SYS_DATA_ROLE("sys_data_role", "数据角色表"),

    CRM_CLUE_INFO("crm_clue_info", "线索信息表"),
    
    CRM_ASSIGN_RECORD("crm_assign_record", "转派记录表"),

    CRM_CLUE_RECORD("crm_clue_record", "线索流程记录列表"),

    CRM_CLUE_DEPT("crm_clue_dept", "线索部门负责人员表"),

    SYS_BACKLOG("sys_backlog", "工作流待办事项表"),

    ACCOUNT_ADD_AUTO("account_add_auto", "账号编码自增"),

    WF_AUDIT("wf_audit", "传阅/备案"),

    WF_INFO("wf_info", "工作流表"),

    WF_NODE("wf_node", "工作流节点表"),

    WF_NODE_TEMP("wf_node_temp", "工作流节点临时表"),

    WF_FORK("wf_fork", "工作流规则表"),

    WF_FORK_TEMP("wf_fork_temp", "工作流规则临时表"),

    WPS_CHECKIN_RECORD("wps_checkin_record", "考勤记录表"),

    DIC_PROJECT_CLASS("dic_project_class", "项目分类字典表"),

    DIC_MATERIAL("dic_material", "材料编码字典表"),

    WF_USER_NODE("wf_user_node", "用户节点信息"),

    DIC_SERVICES("dic_services", "服务字典表"),

    EPM_PROJECT_INFO("project_info", "项目信息表"),

    EPM_PROJECT_MATERIAL("project_material", "项目材料表"),

    EPM_PROJECT_SERVICES("project_services", "项目业务表"),

    WPS_WORK_PLAN_WEEK("wps_work_plan_week", "周工作计划表"),

    WPS_WORK_PLAN_DAY("wps_work_plan_day", "日工作计划表"),

    EPM_COMMENCEMENT_REPORT("commencement_report", "开工报告表"),

    EPM_MATERIAL_APPLY("material_apply", "材料申请单"),

    EPM_MATERIAL_APPLY_ENCLOSURE("material_apply_enclosure", "材料申请附件"),

    WF_ROLE_CONF("wf_role_conf", "工作流角色配置表"),

    WF_ROLE_INFO("wf_role_info", "工作流角色信息表"),

    WPS_WORK_PLAN_LOG("wps_work_plan_log", "操作记录表"),

    WPS_CONCERN("wps_concern", "关注表"),

    WPS_VISITORS_RECORD("wps_visitors_record", "访客记录表"),

    WPS_RETINUE_RECORD("wps_retinue_record", "随同人员记录表"),

    WPS_VISIT_HISTORY("wps_visit_history", "访问历史表"),

    WPS_MONITOR_ACTION("wps_monitor_action", "班组长关键动作表"),

    WPS_MONITOR_ACTION_QUESTION("wps_monitor_action_question", "班组长关键动作问题表"),

    WPS_BUSINESS_TRIP_WEEK_REVIEW("wps_business_trip_week_review", "出差日计划回顾表"),

    WPS_BUSINESS_TRIP_WEEK_PLAN("wps_business_trip_week_plan", "出差周计划表"),

    WPS_BUSINESS_TRIP_WEEK_PLAN_VISIT("wps_business_trip_week_plan_visit", "出差周计划访客对象表"),

    SYS_EHR_ORG("sys_ehr_org", "saas与EHR组织机构关系表"),

    AUTO_ADD_ORG_CODE("auto_add_org_code", "saas组织机构编码自增"),

    AUTO_ADD_PERSON_CODE("auto_add_person_code", "saas人员信息编码自增"),

    MMP_VISIT_OBJECT("mmp_visit_object", "客商信息表"),

    MMP_MINI_QRCODE("mmp_mini_qrcode", "小程序二维码信息"),

    MMP_VISIT_OBJECT_CHANGE("mmp_visit_object_change", "客商信息变更表"),

    MMP_CONTACTS_RELATION("mmp_contacts_relation", "客商信息联系人关联表"),

    USER_MSG_ERROR("user_msg_error", "用户信息互串记录表"),

    SYN_WE_CHAT_ORG_FAILURE("wechat_syn_org_compensate", "同步企业微信组织机构失败记录表"),

    MMP_CONTACTS_RELATION_CHANGE("mmp_contacts_relation_change", "客商联系人变更记录表"),

    MMP_CUSTOMER_PROJECT_RELATION("mmp_customer_project_relation", "客商项目关系表"),

    CRM_CUSTOMER_CONTACT("crm_customer_contact", "客户联系人表"),

    CRM_CUSTOMER_INFO("crm_customer_info", "客户信息表"),

    CRM_INTERVIEW_IMG("crm_interview_img", "考察与面签图片表"),

    CRM_INTERVIEW_INFO("crm_interview_info", "考察与面签信息表"),

    CRM_QUERY_PERMISSION("crm_query_permission", "查询权限表"),

    PRC_STAFF_DISCOUNT("prc_staff_discount", "人员折扣表"),

    SYS_MY_APP("sys_my_app", "我的应用"),

    SYS_DATABLOCK_ROLE("sys_datablock_role", "账号数据块关联"),

    SYS_DATABLOCK("sys_datablock", "数据块"),

    SYS_MENU("sys_menu", "菜单表"),

    USER_DEVICE_RELATION("user_device_relation", "用户设备关联表"),

    WPS_MEETING_INFO("wps_meeting_info", "会议信息表"),

    WPS_MEETING_PERSONNEL("wps_meeting_personnel", "会议参会人员记录表"),

    WPS_MEETING_DOCUMENTS("wps_meeting_documents", "会议文档表"),

    SYS_PROXY_CONFIG("sys_proxy_config", "代理配置信息记录表"),

    SYS_TEMPORARY_ADJUSTMENT("sys_temporary_adjustment","临时调岗表"),
    
    WPS_CHECKIN_OVERTIME("wps_checkin_overtime","考勤加班清单表"),

    WPS_WORK_REVIEW_DETAILS("wps_work_review_details", "回顾明细表"),
    
    WPS_MEETING_ADDRESS("wps_meeting_address", "会议地址表");

    private String key;
    private String description;

    PrincipalEnum(String code, String description) {
        this.key = code;
        this.description = description;
    }

    public static String get(PrincipalEnum key) {
        for (PrincipalEnum model : EnumSet.allOf(PrincipalEnum.class)) {
            if (key == model) {
                return model.key;
            }
        }
        return null;
    }

    public String getKey() {
        return this.key;
    }

    public String getDescription() {
        return this.description;
    }

}
