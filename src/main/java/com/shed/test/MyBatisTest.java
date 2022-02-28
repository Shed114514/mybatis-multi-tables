package com.shed.test;

import com.shed.domain.Member;
import com.shed.domain.Order;
import com.shed.domain.User;
import com.shed.mapper.MemberMapper;
import com.shed.mapper.OrderMapper;
import com.shed.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MyBatisTest {

    private MemberMapper memberMapper;
    private OrderMapper orderMapper;
    private UserMapper userMapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMappingConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession(true);
        memberMapper = sqlSession.getMapper(MemberMapper.class);
        orderMapper = sqlSession.getMapper(OrderMapper.class);
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testOrderInsert() {
        Order order = new Order(6,new Date(),2000,6);
        orderMapper.insert(order);
    }

    @Test
    public void testSelectOrderAndMember() {
        List<Order> orderList = orderMapper.selectOrderAndMember();
        for (Order order : orderList) {
            System.out.println(order);
        }
    }

    @Test
    public void testSelectMemberandOrders() {
        List<Member> memberList = memberMapper.selectMemberAndOrders();
        for (Member member : memberList) {
            System.out.println(member);
        }
    }

    @Test
    public void testSelectUsersAndRoles() {
        List<User> userList = userMapper.selectUsersAndRoles();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
